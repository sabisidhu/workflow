package enitytTest;

import java.util.Map;

public class Context {
   static Map<String,MasterEntity> context;


    public static void setEntities(String key,MasterEntity entities){
        context.put(key,entities);
    }

    public static void main(String[] args) {
        MasterEntity test = new MemberEntity();
        MasterEntity formationDetails = new FormationDetails();
        setEntities("member",test);
        setEntities("formation",formationDetails);
    }
}
