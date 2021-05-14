package examples;

import java.util.ArrayList;
import java.util.List;


public class NewDiseaseSorter {
  public static void main(String[] args) {
    NewDisease polio = new NewDisease(false, "polio");
    NewDisease flu = new NewDisease(true, "influenza");
    NewDisease malaria = new NewDisease(true, "malaria");
    NewDisease cancer = new NewDisease(false, "cancer");

    List<NewDisease> diseases = new ArrayList();
    diseases.add(polio);
    diseases.add(flu);
    diseases.add(malaria);
    diseases.add(cancer);

    cancer.setCurable(true);
    System.out.println("Curable diseases:");
    for (NewDisease disease: diseases) {
      if (disease.isCurable()) {
        System.out.println(disease.getName());
      }
    }

  }
}
