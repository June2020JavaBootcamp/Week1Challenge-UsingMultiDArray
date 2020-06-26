import java.util.Random;

public class Burritos {

    public static void main(String[] args) {

        Random rand = new Random();
        String[] Rice = {"White", "Brown", "None", "All"};
        String[] Meat = {"Chicken", "Steak", "Carnidas", "Chorizo", "Sofritas", "Veggie", "None", "All"};
        String[] Beans = {"Pinto", "Black", "None", "All"};
        String[] Salsa = {"Mild", "Medium", "Hot", "None", "All"};
        String[] Veggies = {"Lettuce", "Fajita", "None", "All"};
        String[] Cheese = {"Yes", "No"};
        String[] Guac = {"Yes", "No"};
        String[] Queso = {"Yes", "No"};
        String[] SourCream = {"Yes", "No"};

// to store ingredients
        int[][] Burritos = new int[25][9];
// to store price
        double[] Price = new double[25];

//burritos array
        for (int row = 0; row < 25; row++) {

            Burritos[row][0] = 2;
            Burritos[row][1] = 6;
            Burritos[row][2] = 2;
            Burritos[row][3] = 3;
            Burritos[row][4] = 2;
            Burritos[row][5] = 1;
            Burritos[row][6] = 1;
            Burritos[row][7] = 1;
            Burritos[row][8] = 1;
        }
//price
        for (int row = 0; row < 25; row++)
            Price[row] = 0.00;

        //25 burritos total
        int ingdCount = 0;
        double price = 3.00;
        for (int burrCount = 0; burrCount < 25; burrCount++) {

            //random for numbers 5-9
            int totalIngd = rand.nextInt(5) + 9;
            ingdCount = 0;
            price = 3.00;

//price for ingredients
            int choiceRice = rand.nextInt(Rice.length);
            Burritos[burrCount][0] = choiceRice;

            if (!"None".equals(Rice[choiceRice])) {

                price += 0.50;
                ingdCount++;


                int choiceMeat = rand.nextInt(Meat.length);
                Burritos[burrCount][1] = choiceMeat;

                if (!"None".equals(Meat[choiceMeat])) {

                    price += 0.50;
                    ingdCount++;
                }
                int choiceBeans = rand.nextInt(Beans.length);
                Burritos[burrCount][2] = choiceBeans;

                if (!"None".equals(Beans[choiceBeans])) {
                    price += 0.50;
                    ingdCount++;
                }
                int choiceSalsa = rand.nextInt(Salsa.length);

                Burritos[burrCount][3] = choiceSalsa;

                if (!"None".equals(Salsa[choiceSalsa])) {

                    price += 0.50;
                    ingdCount++;
                }


                int choiceVeggies = rand.nextInt(Veggies.length);
                Burritos[burrCount][4] = choiceVeggies;
                if (!"None".equals(Veggies[choiceVeggies])) {
                    price += 0.50;
                    ingdCount++;
                }
                int choiceCheese = rand.nextInt(Cheese.length);
                Burritos[burrCount][5] = choiceCheese;

                if (!"No".equals(Cheese[choiceCheese])) {

                    price += 0.50;
                    ingdCount++;
                }

                int choiceGuac = rand.nextInt(Guac.length);

                Burritos[burrCount][6] = choiceGuac;
                if (!"No".equals(Guac[choiceGuac])) {
                    price += 0.50;
                    ingdCount++;
                }
            }

                int choiceQueso = rand.nextInt(Queso.length);
                Burritos[burrCount][7] = choiceQueso;
                if (!"No".equals(Queso[choiceQueso])) {
                    price += 0.50;
                    ingdCount++;
                }


                int choiceCream = rand.nextInt(SourCream.length);
                Burritos[burrCount][8] = choiceCream;
                if (!"No".equals(SourCream[choiceCream])) {
                    price += 0.50;
                    ingdCount++;
                }

                Price[burrCount] = price;
            }

            int temp = 0;
            //burritos with random ingredients
            for (int burrCt = 1; burrCt < 25; burrCt++) {
                System.out.println("Burrito:" + (burrCt + 1) + " Price:$" + Price[burrCt] + "");

                temp = Burritos[burrCt][0];
                System.out.print("Rice:" + Rice[temp]);
                temp = Burritos[burrCt][1];
                System.out.print("Meat:" + Meat[temp]);
                temp = Burritos[burrCt][2];
                System.out.print("Beans:" + Beans[temp]);
                temp = Burritos[burrCt][3];
                System.out.print("Salsa:" + Salsa[temp]);
                temp = Burritos[burrCt][4];
                System.out.println("Veggies:" + Veggies[temp]);
                temp = Burritos[burrCt][5];
                System.out.print("Cheese:" + Cheese[temp]);
                temp = Burritos[burrCt][6];
                System.out.print("Guac:" + Guac[temp]);
                temp = Burritos[burrCt][7];
                System.out.print("Queso:" + Queso[temp]);
                temp = Burritos[burrCt][8];
                System.out.println("Sour Cream:" + SourCream[temp]);
            }

        }
    }
