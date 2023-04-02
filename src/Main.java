import java.util.Scanner;


public class Main
{
    // The extendArray method takes in a int array and a int value and replicates that array with the int value added on to the end
    public static int[] extendArray(int arr[], int y)
    {
        int newArr[] = new int[arr.length + 1];

        for (int a = 0; a < arr.length; a++)
        {
            newArr[a] = arr[a];
        }
        newArr[arr.length] = y;

        return newArr;
    }
    //The doubleArray method takes an int array and returns a double equivalent array
    public static double[] doubleArray(int arr[])
    {
        double doubleArr[] = new double[arr.length];

        for (int a = 0; a < arr.length; a++)
        {
            doubleArr[a] = arr[a];
        }
        return doubleArr;

    }
    //The checkArraySize method takes an int array and returns true if the sum of its elements is > 100
    public static Boolean checkArraySize(int arr[])
    {
        int arraySum = 0;
        for (int l = 0; l < arr.length; l++)
        {
            arraySum += arr[l];
        }
        if (arraySum >= 100)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    //The compareAverage method takes 2 double arrays and returns true if the average value of array 1 > array 2
    public static Boolean compareAverage(double arr1[], double arr2[])
    {
        double averageArr1 = 0.0;
        double averageArr2 = 0.0;
        for (int h = 0; h < arr1.length; h++)
        {
            averageArr1 += arr1[h];
        }
        for (int d = 0; d < arr2.length; d++)
        {
            averageArr2 += arr2[d];
        }

        if (averageArr1 > (averageArr2))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    //The arrayAverage takes a double array and returns the average value of its elements
    public static double arrayAverage(double arr[])
    {
        double arrTotal = 0.0;
        for (int g = 0; g < arr.length; g++)
        {
            arrTotal += arr[g];
        }
        double arrAverage = arrTotal / arr.length;
        return arrAverage;
    }

    //scanString method creates a new input instance and returns a String from user input
    //This was created to simplify Scanner usage and prevent overflow between inputs
    public static String scanString()
    {
        Scanner recieveString = new Scanner(System.in);
        String newString = recieveString.next();
        return newString;
    }

    //scanInt method creates a new input instance and returns an int value from user input
    //Same reason as scanString
    public static int scanInt()
    {
        Scanner recieveInt = new Scanner(System.in);
        int newInt = recieveInt.nextInt();
        return newInt;
    }
    //scanInt method creates a new input instance and returns a double value from user input
    //Same reason as scanString
    public static double scanDouble()
    {
        Scanner recieveDouble = new Scanner(System.in);
        Double newDouble = recieveDouble.nextDouble();
        return newDouble;
    }
    //scanDouble method creates a new input instance and returns a boolean value from user input
    //Same reason as scanBoolean
    public static boolean scanBoolean()
    {
        Scanner recieveBoolean = new Scanner(System.in);
        boolean newBoolean = recieveBoolean.nextBoolean();
        return newBoolean;
    }
    //willBuyDrink takes a boolean and a double value, and will return true if both values meet the requirements
    private static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket)
    {
        if (isHotOutside == true && moneyInPocket > 10.50)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    //repeatWord takes a string and an int, it concatenates the string int times
    //No spaces between Strings, returns the concatenated value
    public static String repeatWord(String word, int z)
    {
        int repetitions = 0;
        String concatWord = "";
        while (repetitions < z)
        {
            concatWord += word;
            repetitions++;
        }
        return concatWord;
    }
    //mergeWord takes two Strings and merges them with a space, returns the merged String
    public static String mergeWord(String firstName, String lastName)
    {
        String fullName = firstName + " " + lastName;
        System.out.println("The full name is " + fullName);
        return fullName;
    }

    public static void main(String[] args)
    {
        //create a predetermined int array
        int[] ages = new int[] {3, 9, 23, 64, 2, 8, 28, 93};

        //subtracts the first element of the array from the last
        int difference = ages[0] - ages[ages.length - 1];
        System.out.println("The difference between " + ages[0] + " and " + ages[ages.length - 1] + " is " + difference);

        //calls scanInt and extendArray to add a value onto the end of the array and make the array 1 element longer
        System.out.print("enter a number: ");
        int newNum = scanInt();
        ages = extendArray(ages, newNum);

        int newDifference = ages[0] - ages[ages.length - 1];
        System.out.println("The new difference between " + ages[0] + " and " + ages[ages.length - 1] + " is " + newDifference);

        //uses a while loop to calculate the average value of the elements in the ages array
        int count = 0;
        int total = 0;
        while (count < ages.length)
        {
            total += ages[count];
            count++;
        }

        System.out.println( "The final sum of ages is " + total);
        int average = total / count;
        System.out.println("The averaged value of ages is " + average);

        //creates a predetermined String array
        String names[] = new String[] {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

        //uses a for loop to get the average number of characters in each element of the names array
        int numChar = 0;
        String fullArray = "";
        for (int i = 0; i < names.length; i++)
        {
            numChar += names[i].length();
            fullArray += names[i] + " ";
        }
        int charAverage = numChar / names.length;
        System.out.println("The average number of characters in each word in names is " + charAverage);
        System.out.println("The full list in names is: " + fullArray);

        //uses a for loop to get the total number of characters in the names array
        int[] nameLengths = new int[names.length];
        int sumLengths = 0;
        for (int k = 0; k < nameLengths.length; k++)
        {
            nameLengths[k] = names[k].length();
            sumLengths += nameLengths[k];
        }
        System.out.println("The sum of all the elements in the nameLengths array is " + sumLengths);

        //takes an int and a string input to use in repeatWord, print the result
        System.out.print("How many times do you want a word to repeat: ");
        int totalReps = scanInt();
        System.out.print("What word would you like to repeat: ");
        String takenWord = scanString();
        String concatedWord = repeatWord(takenWord, totalReps);
        System.out.println(concatedWord);

        //take a first and last name as inputs, use mergeWord to create a fullname
        System.out.print("Enter a first Name: ");
        String firstName = scanString();
        System.out.print("Enter a last Name: ");
        String lastName = scanString();
        String fullName = mergeWord(firstName, lastName);

        //create an array for testing purposes
        int[] newArray = new int[] {1, 2, 3};
        //check if the sum of elements in ages array is > 100
        boolean agesLarge = checkArraySize(ages);
        //using the newArray should return false
        boolean newArrayLarge = checkArraySize(newArray);
        //Print results
        System.out.println("The sum of the ages array is greater than 100: " + agesLarge);
        System.out.println("The sum of the newArray is greater than 100: " + newArrayLarge);

        //Create double array that are replicas of ages and newArray
        //Get the average value of each double array
        double[] doubleAges = doubleArray(ages);
        double agesAverage = arrayAverage(doubleAges);
        System.out.println(agesAverage);
        double[] doubleArr = doubleArray(newArray);
        //Check if doubleArray is greater than doubleAges
        //Double check result by reversing the order
        boolean arrGreater = compareAverage(doubleArr, doubleAges);
        System.out.println("The averages of doubleArr is greater than doubleAges: " + arrGreater);
        boolean agesGreater = compareAverage(doubleAges, doubleArr);
        System.out.println("The averages of doubleAges is greater than doubleArr: " + agesGreater);
        //Check if the same array being used results in false
        boolean checkSame = compareAverage(doubleAges, doubleAges);
        System.out.println("If working doubleAges > doubleAges is false: " + checkSame);

        //Acquire a boolean input and a double input for willBuyDrink method
        System.out.print("if hot outside type 'true', otherwise type 'false': ");
        boolean isHotOutside = scanBoolean();
        System.out.print("How much money do you have? Insert answer as a decimal: ");
        double moneyInPocket = scanDouble();
        boolean acquireDrink = willBuyDrink(isHotOutside, moneyInPocket);
        //prints different messages based on what willBuyDrink returns
        if (acquireDrink == true)
        {
            System.out.println("you have bought a drink.");
        }
        else
        {
            System.out.println("do to extenuating circumstances, you have not acquired the drink. :(");
        }
    }
}