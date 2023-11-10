public class MadLib {
    String classmate = "Qasim";
    String city = "St. Catharines";
    String noun = "School";
    String pluralNoun = "Teachers";
    Double decimalBiggerThan1 = 27.9;
    String adjective = "Strong";
    int number1 = 9;
    String pluralAnimal = "Spiders";
    String miltonTeacher = "Ms Lockwood";
    boolean trueOrFalse = true;
     int wholeNumberBetween1And4 = 3;
     String season = "winter";
     String miltonDean = "Mr Furst";
     int number2 = 98;
     char letterGrade = 'A';



    public static void main(String[] args) {
        MadLib story = new MadLib();
    }

    public MadLib() {
        System.out.println(story);

    }


    //define a string called story for mad lib
    String story = "This weekend I am going camping with "
            +classmate+ ". We are going to a campsite in "
            +city+ ". I packed my "+noun+ " and "
            +pluralNoun + ".  The forecast is calling for a high of "
            +decimalBiggerThan1+ " degrees fahrenheit. So it should be a "
            +adjective+" day! This year, the park rangers have seen "
            +number1+ " " +pluralAnimal + " which seems kind of dangerous. "
            +miltonTeacher+" said it's " + trueOrFalse + " that "+pluralAnimal+ " eat class "
            +wholeNumberBetween1And4+ " students in the " +season+ ". But, "
            +miltonDean+ " said it actually has only happened "
            + number2+" times. Wish us luck! If we survive, we will earn a "
            +letterGrade+ "- in P.E. class.";

//now print story to the dos window


}