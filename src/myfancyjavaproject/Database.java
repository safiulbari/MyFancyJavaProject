package myfancyjavaproject;

class Database {

   public void getConnection() {
       System.out.println("You are now connected to the database.");
       System.out.println("Database strating...");
   }

    private static Database dbObject;

    private Database() {      
    }

    public static Database getInstance() {
       if(dbObject == null) {
          dbObject = new Database();
       }
        return dbObject;
    }
 
}