public class Root {//singelton




    





















    private static Root rootInstance;

    private Root(String name) {

    }

    //this methods try to create the RootInstance
    public static Root getInstance() {
       // return new Root();

        if (rootInstance == null) {
            //we need to create it first time
            rootInstance = new Root("first");//this is the only place we create instance
        }
        //not a first time

        return rootInstance;

    }

}
