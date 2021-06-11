package bilha.moses.faith.sharon.library;
import java.util.Scanner;

public class Main {
    //Welcome Message
    public static void welcomeMessage() {
        System.out.println("Hello....Welcome to Mzalendo Library");
        System.out.println("Please LogIn");
    }

    //Create LogIn Object
    private LogIn Enter;

    //Books Available
    //Romance Books Available

    private String[] Romance = {"A lie in church", "A slave to him", "Found", "Closer", "My little pet",
            "Once you", "Yes master", "To all the boys have loved", "Purchased wife", "Black Rainbow",
            "A redo", "The assistant", "Fifty shades of grey", "Always and forever", "Twilight", "The baller",
            "The boy who sneaks in my bedroom window", "Awkward"};
    //Fantasy Books Array
    private String[] Fantasy = {"Harry Potter", "Ragnarok", "The Hammer Of Thor", "Percy Jackson",
            "The Immortals Of Meluha", "Queen Of Shadows", "Feral Sins", "The Mark Of Athena", "The Lost Hero",
            "City Of Bones", "The Hidden Alpha", "The Alchemist", "Throne Of Glass", "Chasing Red", "The Blood Of Olympus",
            "Claimed", "The Selection", "Divergent", "Empire Of Storms", "Lord Of Shadows", "Hunted", "Burn", "Heir Of Fire",
            "The Little Prince", "The Dark Prophesy", "Dead Beautiful", "A court Of Mist", "The Krishna Key"};
    //Mystery Books Array
    private String[] Mystery = {"The Obsession", "One Of Us Is Lying", "Sweet Dreams", "Marry Me Stranger", "The Da Vinci Code",
            "Origin", "The Liar", "Forget Me Not Stranger", "The Witness", "Alone In Thhe Dark", "You", "The Escape", "Absolute Power"
            , "If Tomorrow Comes", "Gone Girl", "The GodFather", "The Defense", "The Search", "Memory Man", "Master Of the Game",
            "The Innocent", "Tell Me Your Dreams", "Die For Me", "Angels and Demons", "Genuine Lies", "Bloodline", "The Plea", "Nothing Lasts Forever"
            , "Sherlock Holmes", "Genuine Lies", "The villa", "Game Of Silence", "The fix", "The Affair", "Deception Point", "Nothern Lights",
            "A Prisoner Of Birth", "Count To Ten", "Night School", "Shelter in Place", "Dark Matter",};
    //Educational Books Array
    private String[] Educational = {"Effortless English", "Mindset", "Atomic Habits", "KMF physics", "Robotics", "Mechanics", "The Talent Code",
            "You are Your Own Gym", "The Boy Who was raised as a dog", "Vocabulary And Spelling Success", "The Ultimate Book Of Mind",
            "Barrons GRE", "Flashback", "Phylosophy For Dummies", "The Grammar Bible", "Out Of Our Minds", "How To Think Like Shelock Holmes",
            "Life Ahead", "Anatomy And Physiology for dummies", "A whole new mind", "One Child", "Painless Grammar", "How To Study With Mind Maps",
            "Finding Your Element", "Brain And Behaviour", "The Teenage Brain", "Trigonometry For Dummies", "Critical Thinking", "Train Your Brain", "Calculus For Dummies",
            "Teaching Kids To Think", "The Book Whisperer", "Nutrition For Dummies", "Digital Marketting For Dummies", "To sir...With Love",
            "Getting From College To Career", "Creative Schools", "Out Of Control", "Whole New Mind", "The Tiger's Child", "Astronomy for dummies",
            "The Theory Toolbox", " Silent Boy", "From Chanakya to Modi", "The Basics of hacking and penetration testing"};
    //Biography Books Array
    private String[] Biography = {"The Diary Of  A Young Girl", "Dongri To Dubai", "Born A Crime", "Steve Jobs", "Shoe Dog", "Life Without Limits",
            "No One Wants You", "Educated:A Memoir", "The First Muslim", "Tuesdays With Morrie", "When Breath Becomes Air", "Long Walk To Freedom",
            "The Ice Man", "Anne Frank", "I cant Make This Up", "Alibaba", "The girl with seven names", "The Game", "Alexander The Great", "The Accidental Prime Minister"
            , "Seriously...Im kidding", "Gaddafi's Harem", "I am Malala", "Diana", "Playing It My Way", "Princess", "Left To Tell", "Gifted Hands",
            "Think Big", "The Brave", "Confesssions Of An Economic Hitman", "Letter To My Daughter"};
    //History Books Array
    private String[] History = {"Sapiens", "Shivaji", "The Brave", "Meditations", "Prisoners Of Geography", "Dubar", "The Discovery Of India",
            "Mastering Modern World", "An Era Of Darkness", "Maps Of Meaning", "Rise And Kill First", "The World Was Going Our Way",
            "The Unending Game", "Jerusalem", "Einstein", "The Grass Crown", "Gideon's Spies", "There was  A Country", "A Woman In Berlin",
            "The World As I See It", "The Underground Girls Of Kabul", "The siege Of Mecca", "Nikola Tesla", "Cosmos", "The 48 Laws Of power",
            "Collapse", "The Difficulties of Being Good", "Berlin", "Who Rules The World", "Art Of War", "Orientalism", "Ghost Wars",
            "The Coming Collapse Of China", "A History Of God", "Common Sense", "Black Tornado", "In a Different Key", "What I know For Sure", "The Siege"};
    //Horror Books Array
    private String[] Horror = {"The Eyes Of Darkness", "Dead Beautiful", "Revenge Of The Witch", "It", "The Shining", "The Picture Of Dorian Gray",
            "The Silence Of The Lambs", "Doctor Sleep", "The Stand", "The Graveyard Book", "The Amityville Horror", "Bad  Girls Dont Lie",
            "American Psycho", "Watchers", "Pet Cemetery", "Dracula", "The Key To Midnight", "Killing Pretty", "Beware The Night", "Needful Things",
            "The Witching Hour", "Bad Dreams", "Monster", "Carroline", "The wolf in winter", "Last Days", "Frankenstein", "Come Closer", "Raiser Of Gales",
            "City Of Night", "Phantoms", "Red Dragon", "Final Girls", "Odd Thomas", "False Memory", "The Cliffhouse Haunting", "The Ocean AT the End Of The ",
            "The Long Walk", "Anna Dressed In Blood", "The Getaway god", "Monster Hunter InternationalThe Demonologist", "Welcome To the Camp Nightmare", "Where are the children"};
    //Comic books array
    private String[] Comics = {"Worm", "Batman", "SuperFly", "Big Nate Makes The Grade", "Black Widow", "The Outlaw", "Super Powereds",
            "Reaping angels", "The Mad Mask", "Unmasked", "The Death And Life Of Superman", "The Superheroes Powers", "The Flash", "Civil War",
            "The Second Super", "LockDown", "LoveCraft", "X-Men", "BatMan Begins", "Powerless", "Karma Girl", "The Hobbit", "Captain Awesome",
            "Its Superman", "The Girl Who Would Be King", "The Dark Knight", "Healers", "Hellboy", "Secret Jobs", "Fatal legacies", "Sovereign",
            "Siege", "Arrow", "The Rise Of The Renegade X", "Things Change", "Mic Drop", "Secret Wars", "Batman Forever", "Marvel Rising",
            "Subject 624", "The Last Stand", "Sharkman", "Ex-Communication"};
    //Drama books Array
    private String[] Drama = {"Nothing Left To Lose", "The Unwanted Wife", "Me Before You", "After You", "Master Of Te Game", "Kane And Abel", "A prisoner of birth", "Revved",
            "Are You Afraid Of The DARK", "The Prodigal daughter", "Rage Of Angels", "Worth Fighting For", "Romeo And Juliet",
            "The Choice", "Cathedral of the sea", "Safe Harbour", "Doctors", "Hotel", "Handle With Care", "The Crucible", "Mystic River",
            "Hamlet", "The Ranch", "MacBeth", "Arms And The Man", "Mistrals Daughter", "Nineteen Minutes", "Waiting For Godot", "A forever Family",
            "Silence", "Planning For Love", "Julius Caesar", "Up To No Good", "Toxic Bachelors",
            "Othello", "Keeping Faith", "Safe Haven", "Where LOVE has Gone", "The Tempest"};
    //Humor books Array
    private String[] Humor = {"Perfectly Toxic", "Bossman", "Egomaniac", "Triple Dare", "The Baller", "The Marriage Bargain",
            "Sweet Dreams", "The Mistake", "The Temporary Wife", "Mister Moneybags", "Tangled", "Wallbanger", "Cross The Line",
            "Worth It", "Roomies", "Act LIKE a Lady...Think Like a Man", "Kiss An Angel", "Diary Of A wimpy kid", "A man called ove"
            , "Ive Got your number", "the healer", "Now its you and me", "sustained", "Friend-zoned", "Tempt The Boss"};
    //Economics Array Books
    private String[] Economics = {"Rich Dad Poor Dad", "Think And Grow Rich", "Think ANd Grow Rich", "The Intelligent Investor",
            "Zero to one", "Secrets of a millionaire mind", "Thinking Fast and Slow", "Outliers", "Factfulness", "The Science of Getting Rich",
            "Principles", "I dO wHAT i dO", "Market Wizards", "Freakonomics", "Basic Economics", "Poor Economics", "Profit First", "The Goal",
            "I will Teach You to be rich", "Blink", "Warren Buffet", "Beating The Street", "Skin In The Game", "Who Rules The World?", "The Coming CollapSE oF China",
            "Rise Of The Robots", "The Little book of Common Sense Investing", "The AutoBiography Of Stock", "Dream Big", "Flash Boys"};
    //Cultural Array Books
    private String[] Cultural = {"The Immortals Of Meluha", "Ikigai", "Shivaji", "The Palce Of Illusions", "Americanah", "Half Girlfriend", "Wise And Otherwise",
            "Revolution 2020", "Things Fall Apart", "Everyone Has Story", "Half Lion", "The Three Mistakes Of My Life", "Black Suits You",
            "The White Tiger", "Gujarat Files", "Asura", "Norwegian Wood", "Why i am a Hindu", "The Girl With The Dragon tattoo", "Purple Hibiscus",
            "Birds Of Prey", "The Namesake", "My Gita", "Half of  a Yellow Sun", "Left To TELL", "The Twentieth Wife", "Sacred Games",
            "Pharaoh", "Sita", "Arrow Of God", "Crime And Punishment", "Undying Affinity", "The Astral Alibi", "Freedom At Midnight",
            "The Shadow lINES", "The Tigers Prey", "Born On A tuesday"};

    //specify max number of elements
    private String[] userCategory = new String[2];
    private String[] userChoices = new String[1];
    private String[] CurrentCategory = new String[1];

    //boolean to store choices
    private boolean chooseInSameCategory = false;
    private boolean chooseInDifferentCategory = false;

    private double DateDifference(int CurrentDate, int DueDate) {
        System.out.println(CurrentDate - DueDate);
        return 0;
    }

    public static void main(String[] args) {
        //Invoke Default Constructor
        Main mainProgram = new Main();
        //Invoke LogIn Constructor
        mainProgram.Enter = new LogIn();
        // Initialize Input
        mainProgram.input = new Scanner(System.in);
        //display welcome message
        mainProgram.welcomeMessage();
        //call DateDifference Method
        mainProgram.DateDifference(11 - 03 - 2020, 12 - 12 - 2020);
        //Date Manipulation
        int Currentdate;
        int DueDate;
        //Authenticate User
        boolean IsSuccessful = mainProgram.LogInUser();

        if (IsSuccessful) {
            mainProgram.UserActivity();
        }
    }

    //Create Scanner Object
    private Scanner input;
    //storing user input
    private String first_name;
    private String Last_name;
    private String Institution;
    private int year_of_study;

    //Prompt User to Input LogIn Details
    private boolean LogInUser() {
        boolean success = true;
        System.out.println("First name: ");
        //Store LogIn Details
        //Intake first name
        String first_name = input.next();
        //Intake Last name
        System.out.println("Last name: ");
        String Last_name = input.next();
        //Intake Institution
        System.out.println("Institution: ");
        String Institution = input.next();
        //Intake year_of_Study
        System.out.println("Year of Study(enter integer value): ");
        int year_of_study = input.nextInt();
        //Intake CurrentDate
        System.out.println("CurrentDate(enter integer value): ");
        int CurrentDate = input.nextInt();
        //intake DueDate
        System.out.println("DueDate(enter integer value):");
        int DueDate = input.nextInt();


        //Store values in setters
        Enter.setFirst_name(first_name);
        Enter.setLast_name(Last_name);
        Enter.setInstitution(Institution);
        Enter.setYear_of_study(year_of_study);
        Enter.setCurrentDate(CurrentDate);
        Enter.setDueDate(DueDate);
        return true;
    }

    //Choosing category
    //retrieve user
    private char UserActivity() {
        String actualUser = Enter.getFirst_name();
        System.out.println("Hi, " + actualUser);

        //Prompt User For Choice
        System.out.println("Which of the following would you like to do " +
                "\nX. Borrowing Book" +
                "\nZ. Returning book");
        //Allow User to Choose Category
        String choice = input.next();
        char ReturnValue = 'C';
        if (choice.length() > 1) {
            System.out.println("Enter a valid choice." +
                    "Strings are not allowed.");
        } else {

            if ("X".equals(choice)) {
                System.out.println(CategoryMenu(Mystery, pos));
                pos = pos + 1;
                arrayLength = arrayLength + 1;
            } else {
                System.out.println("Your Choice Is Invalid");

            }
        }

            if ("Z".equals(choice)) {
                System.out.println("Here are Your Charges For Returning The book late" +
                        "\nM.Kshs 5 per day if book is past by a week" +
                        "\nN.Kshs 10 per day if book is past by 2 weeks" +
                        "\nO.Kshs 50 per day if book is past by a month");
                //Allow user to choose
                String penalty = input.next();
                switch (penalty) {
                    case "M":
                        System.out.println("your charge is" + 8 * 5);
                        if ("N".equals(penalty)) {
                            System.out.println("your charge is" + 8 * 10);
                        } else if ("O".equals(penalty)) {
                            System.out.println("your charge is" + 8 * 50);

                        }

                        break;
                    default:
                        System.out.println("your charge is" + 8 * 5);

                }

            }
        return ReturnValue;

    }
    //positioning variable
    private int pos = 0;
    //value where array has reached
    private int arrayLength = 1;

    //Creating Other Menus
    private char CategoryMenu(String[] MenuSelection, int pos) {
        System.out.println("Which Of The Following Categories Would You Like To Choose From?" +
                "\nA. Romance" +
                "\nB. Fantasy" +
                "\nC. Mystery" +
                "\nD. Educational" +
                "\nE. Biography" +
                "\nF. History" +
                "\nG. Horror" +
                "\nH. Comics" +
                "\nI. Drama" +
                "\nJ. Humor" +
                "\nK. Economics" +
                "\nL. Cultural"
        );
        String choice = input.next();
        //create array of char choices
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's'};
        //loop for display purposes
        for (int i = 0; i < alphabet.length; i++) {
            //show menu
            System.out.println(alphabet[i] + ". " + MenuSelection[i]);

        }
        char ReturnValue = 'a';
        if (choice.length() > 1) {
            System.out.println("Enter a valid choice." +
                    "Strings are not allowed.");
        } else {


            //validate the user did in fact give a character
            if (choice.length() > 1) {
                System.out.println("Pick a valid choice");
            } else {

                // int to store choice
                int another;

                //validate actual character
                if ("A".equals(choice)) {
                    System.out.println(CategoryMenu(Romance, pos));
                    userChoices[pos] = MenuSelection[0];
                    System.out.println("Do you want to pick another choice?");
                    another = input.nextInt();
                    if (another == 0) {
                        System.out.println("Thank you for using Mzalendo Library");
                    } else if (another == 1) {
                        pos = pos + 1;
                        arrayLength = arrayLength + 1;
                        CategoryMenu(MenuSelection, pos);

                    } else {
                        UserActivity();
                    }

                } else {
                    if ("B".equals(choice)) {
                        System.out.println(CategoryMenu(Fantasy, pos));
                        userChoices[pos] = MenuSelection[0];
                        System.out.println("Do you want to pick another choice?");
                        another = input.nextInt();
                        if (another == 0) {
                            System.out.println("Thank you for using Mzalendo Library");
                        } else if (another == 1) {
                            pos = pos + 1;
                            arrayLength = arrayLength + 1;
                            CategoryMenu(MenuSelection, pos);

                        } else {
                            UserActivity();
                        }
                    } else {
                        if ("C".equals(choice)) {
                            System.out.println(CategoryMenu(Mystery, pos));
                            userChoices[pos] = MenuSelection[0];
                            System.out.println("Do you want to pick another choice?");
                            another = input.nextInt();
                            if (another == 0) {
                                System.out.println("Thank you for using Mzalendo Library");
                            } else if (another == 1) {
                                pos = pos + 1;
                                arrayLength = arrayLength + 1;
                                CategoryMenu(MenuSelection, pos);

                            } else {
                                UserActivity();
                            }
                        } else {
                            if ("D".equals(choice)) {
                                System.out.println(CategoryMenu(Educational, pos));
                                userChoices[pos] = MenuSelection[0];
                                System.out.println("Do you want to pick another choice?");
                                another = input.nextInt();
                                if (another == 0) {
                                    System.out.println("Thank you for using Mzalendo Library");
                                } else if (another == 1) {
                                    pos = pos + 1;
                                    arrayLength = arrayLength + 1;
                                    CategoryMenu(MenuSelection, pos);

                                } else {
                                    UserActivity();
                                }


                            }
                        }
                    }
                }
            }
        }
        return ReturnValue;
    }
    private void printReceipt(){
        System.out.println(Enter.getFirst_name() + " here is your bill");
        System.out.println("----------------------");
        //total cost
        int penalty= 0;

        for (int i = 0; i < arrayLength; i++) {

            System.out.println((i+1) + ". " + userChoices[i]);
            System.out.println("----------------------");

            penalty = Integer.parseInt(penalty + userChoices[i]);

        }

    }

}






