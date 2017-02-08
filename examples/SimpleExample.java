package net.encode.RecipeGenerator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import net.encode.Recipes.Container;
import net.encode.Recipes.Cooker;
import net.encode.Recipes.Ingredient;
import net.encode.Recipes.Ingredients;
import net.encode.Recipes.Oneormore;
import net.encode.Recipes.Optional;
import net.encode.Recipes.Recipe;
import net.encode.Recipes.Result;

public class RecipeGenerator {

	public static void main(String[] args) {
		List<Cooker> cookers = new ArrayList<Cooker>();
		cookers.add(new Cooker().withId("oven"));
		cookers.add(new Cooker().withId("campfire").withDifficulty(5f));
		cookers.add(new Cooker().withId("forge").withDifficulty(10f));
		
		List<Container> containers = new ArrayList<Container>();
		containers.add(new Container().withId("pottery bowl"));
		
		List<Oneormore> oneormore = new ArrayList<Oneormore>();
		
		List<Ingredient> list = new ArrayList<Ingredient>();
		list.add(new Ingredient().withId("any herb"));
		oneormore.add(new Oneormore().withList(list));
		
		List<Ingredient> list2 = new ArrayList<Ingredient>();
		list2.add(new Ingredient().withId("any fruit").withCstate("raw").withDifficulty(5f));
		list2.add(new Ingredient().withId("any cereal").withDifficulty(5f));
		list2.add(new Ingredient().withId("any veg").withDifficulty(5f));
		list2.add(new Ingredient().withId("any berry").withCstate("raw").withDifficulty(5f));
		list2.add(new Ingredient().withId("any nut").withDifficulty(5f));
		list2.add(new Ingredient().withId("any mushroom").withDifficulty(5f));
		oneormore.add(new Oneormore().withList(list2));
		
		List<Optional> optional = new ArrayList<Optional>();
		optional.add(new Optional().withId("salt").withDifficulty(5f));
		
		Recipe recipe = new Recipe()
				.withName("casserole (herb)")
				.withRecipeid("1367")
				.withKnown(true)
				.withSkill("hot food cooking")
				.withTrigger("heat")
				.withCookers(cookers)
				.withContainers(containers)
				.withIngredients(new Ingredients().withOneormore(oneormore).withOptional(optional))
				.withResult(new Result()
						.withId("casserole")
						.withName("herb casserole")
						.withDifficulty(11f)
						.withDescription("A tasty casserole with a nice herb smell."));
		
		Gson gson = new Gson();
		
		String jsonString = gson.toJson(recipe);
		
		FileOutputStream fop = null;
		File file;
		try {
			File jarFile = new File(RecipeGenerator.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath());
			String path = jarFile.getParentFile().getPath();
			String decodedPath = URLDecoder.decode(path, "UTF-8");
			
			file = new File(decodedPath+"/recipe"+recipe.getRecipeid().toString()+".json");
			fop = new FileOutputStream(file);
			
			if (!file.exists()) {
				file.createNewFile();
			}
			
			byte[] contentInBytes = jsonString.getBytes();

			fop.write(contentInBytes);
			fop.flush();
			fop.close();

			System.out.println("Done");

		} catch (IOException | URISyntaxException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fop != null) {
					fop.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
