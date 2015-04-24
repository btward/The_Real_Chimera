package thereal.chimera_beta.Categories;

public class CategoryObj extends Object {
    String[] fields;
    String name, type, shortSummary;
    int chimeraScore;

    public CategoryObj(){
        //Constructor

        /*
        type = null;
        name = null;
        fields = null;
        */
    }

    public CategoryObj(String name1){
        name = name1;
    }

    public CategoryObj(String name1, String type1){
        name = name1;
        type = type1;
    }

    public String[] getFields(){
        return fields;}

    public String getName(){
        return name;}

    public String getType(){
        return type;}

    public String getShortSummary(){
        return shortSummary;
    }

    public int getChimeraScore(){
        return chimeraScore;}

    protected void setName(String x){
        name = x;}

    protected void setType(String y){
        type = y;}

    protected void setFields(String[] z){
        fields = z;}

    protected void setShortSummary(String w){
        shortSummary = w;
    }

    public void setChimeraScore(){
        //Abstract Implementation
    }

    protected void setChimeraScore(int a, int b, int c){
        //Implementation Required
    }

    public String toString(){
        return name + " " + type;
    }

}
