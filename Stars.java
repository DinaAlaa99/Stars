class Stars {



    public static void main(String[] args) {
        int i, j;

        for (i = 1; i <= 6; i++) 
		{

            for (j = 1; j <= i; j++)

            {
                System.out.print("*"); //draw star of first triangle
            }
            System.out.print("\t\t\t\t");

            for (int z = i; z < 6; z++)
			{
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++)
            {

                System.out.print("* "); //draw star of second triangle
            }
            System.out.print("\n");


        }
    }
}