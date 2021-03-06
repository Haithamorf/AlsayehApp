package com.example.alsayehapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;

//import android.os.strictmode.InstanceCountViolation;

public class DBConnection extends SQLiteOpenHelper {


      public static final String DbName = "Al-Sayeh.db"; //database name
    public static final int DbVersion = 1; // Version number
    public DBConnection(Context context){
        super(context,DbName,null,DbVersion);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table IF NOT EXISTS Comment (Comment_Num TEXT , Sender TEXT, Receiver TEXT, Content TEXT, Date INTEGER )");
        db.execSQL("create table IF NOT EXISTS ContextFilteringRate (Item_ID TEXT , Person_ID TEXT, Rate REAL)");
        db.execSQL("create table IF NOT EXISTS GuideTourism (ID TEXT PRIMARY KEY UNIQUE, First_Name TEXT, Last_Name TEXT ,User_Name TEXT, Profile TEXT ,Phone_Num TEXT UNIQUE, Email TEXT UNIQUE , Rate REAL )");
        db.execSQL("create table IF NOT EXISTS GuideTourismPlan (Guide_ID TEXT , Plan_ID TEXT PRIMARY KEY UNIQUE,Plan_Num INTEGER ,Description TEXT ,Retrievable INTEGER, Return_Days INTEGER, Adequte TEXT, Duration_Of_Tourism INTEGER, Price REAL ,Rate REAL, Deleted INTEGER )");
        db.execSQL("create table IF NOT EXISTS Place (Plan_ID TEXT , Location INTEGER, Tourist_name TEXT, Description TEXT , Start_Date INTEGER, End_Date INTEGER)");
        db.execSQL("create table IF NOT EXISTS PreviousTrip (Plan_ID TEXT , Guide_Tourism_ID TEXT, Tourist_ID TEXT, Start_Date INTEGER, End_Date INTEGER , Price REAL )");
        db.execSQL("create table IF NOT EXISTS RatePerson (Person_ID TEXT , Rate REAL)");
        db.execSQL("create table IF NOT EXISTS RatePlace (Person_ID TEXT , Rate REAL)");
        db.execSQL("create table IF NOT EXISTS RatePlan (Person_ID TEXT , Plan_ID TEXT, Rate REAL)");
        db.execSQL("create table IF NOT EXISTS Reservation (Reservation_Num TEXT , Guide_Tourism_ID TEXT, Tourist_ID TEXT , Plan_ID TEXT , Date ,Price REAL )");
        db.execSQL("create table IF NOT EXISTS Tourist (ID TEXT PRIMARY KEY UNIQUE , First_Name TEXT,Last_Name TEXT, User_Name TEXT , Birthday INTEGER , Phone_Num TEXT UNIQUE, Email TEXT UNIQUE )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("Drop table if EXISTS Comment");
        db.execSQL("Drop table if EXISTS ContextFilteringRate");
        db.execSQL("Drop table if EXISTS GuideTourism");
        db.execSQL("Drop table if EXISTS GuideTourismPlan");
        db.execSQL("Drop table if EXISTS Place");
        db.execSQL("Drop table if EXISTS PreviousTrip");
        db.execSQL("Drop table if EXISTS RatePerson");
        db.execSQL("Drop table if EXISTS RatePlace");
        db.execSQL("Drop table if EXISTS RatePlan");
        db.execSQL("Drop table if EXISTS Reservation");
        db.execSQL("Drop table if EXISTS Tourist");
        onCreate(db);
    }
//Table Comment
    // insert new row in Comment table at Comment_Num
     public void insertRowCommentNum(String Comment_Num){
         SQLiteDatabase db = this.getWritableDatabase();
         ContentValues contentValues = new ContentValues();

         contentValues.put("Comment_Num", Comment_Num );
         db.insert("Comment",null,contentValues);
     }
    // insert new row in Comment table at Sender
    public void insertRowSender(String Sender){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Sender", Sender );
        db.insert("Comment",null,contentValues);
    }
    // insert new row in Comment table at Receiver
    public void insertRowReceiver(String Receiver){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Receiver", Receiver );
        db.insert("Comment",null,contentValues);
    }
    // insert new row in Comment table at Content
    public void insertRowContent(String Content){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Content", Content );
        db.insert("Comment",null,contentValues);
    }
    // insert new row in Comment table at Date
    public void insertRowDate(int Date){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Date", Date );
        db.insert("Comment",null,contentValues);
    }


//Table Context Filtering Rate
// insert new row in ContextFilteringRate table at Item_ID
public void insertRowItem_ID(String Item_ID) {
    SQLiteDatabase db = this.getWritableDatabase();
    ContentValues contentValues = new ContentValues();

    contentValues.put("Item_ID", Item_ID);
    db.insert("ContextFilteringRate", null, contentValues);

}
    // insert new row in ContextFilteringRate table at Person_ID
    public void insertRowPerson_ID(String Person_ID) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Person_ID", Person_ID);
        db.insert("ContextFilteringRate", null, contentValues);

    }
    // insert new row in ContextFilteringRate table at Rate
    public void insertRowContextFilteringRateRate(double Rate) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Rate", Rate);
        db.insert("ContextFilteringRate", null, contentValues);

    }

    //Table Guide Tourism
// insert new row in GuideTourism table at First_Name
    public void insertRowFirst_Name(String First_Name) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("First_Name", First_Name);
        db.insert("GuideTourism", null, contentValues);

    }
    // insert new row in GuideTourism table at Last_Name
    public void insertRowLast_Name(String Last_Name) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Last_Name", Last_Name);
        db.insert("GuideTourism", null, contentValues);

    }
    // insert new row in GuideTourism table at User_Name
    public void insertRowUser_Name(String User_Name) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("User_Name", User_Name);
        db.insert("GuideTourism", null, contentValues);

    }
    // insert new row in GuideTourism table at Profile
    public void insertRowProfile(String Profile) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Profile", Profile);
        db.insert("GuideTourism", null, contentValues);

    }
    // insert new row in GuideTourism table at Phone_Num
    public void insertRowPhone_Num(String Phone_Num) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Phone_Num", Phone_Num);
        db.insert("GuideTourism", null, contentValues);

    }
    // insert new row in GuideTourism table at Email
    public void insertRowEmail(String Email) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Email", Email);
        db.insert("GuideTourism", null, contentValues);

    }
    // insert new row in GuideTourism table at Rate
    public void insertRowGuideTourismRate(double Rate) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Rate", Rate);
        db.insert("GuideTourism", null, contentValues);

    }


    //Table Guide Tourism Plan
// insert new row in GuideTourismPlan table at Guide_ID
    public void insertRowGuide_ID(String Guide_ID) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Guide_ID", Guide_ID);
        db.insert("GuideTourismPlan", null, contentValues);

    }

    // insert new row in GuideTourismPlan table at Plan_Num
    public void insertRowPlan_Num(String Plan_Num) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Plan_Num", Plan_Num);
        db.insert("GuideTourismPlan", null, contentValues);

    }
    // insert new row in GuideTourismPlan table at Description
    public void insertRowDescription(String Description) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Description", Description);
        db.insert("GuideTourismPlan", null, contentValues);

    }
    // insert new row in GuideTourismPlan table at Retrievable
    public void insertRowRetrievable(int Retrievable) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Retrievable", Retrievable);
        db.insert("GuideTourismPlan", null, contentValues);

    }
    // insert new row in GuideTourismPlan table at Return_Days
    public void insertRowReturn_Days(int Return_Days) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Return_Days", Return_Days);
        db.insert("GuideTourismPlan", null, contentValues);

    }
    // insert new row in GuideTourismPlan table at Adequte
    public void insertRowAdequte(String Adequte) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Adequte", Adequte);
        db.insert("GuideTourismPlan", null, contentValues);

    }
    // insert new row in GuideTourismPlan table at Duration_Of_Tourism
    public void insertRowDuration_Of_Tourism(int Duration_Of_Tourism) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Duration_Of_Tourism", Duration_Of_Tourism);
        db.insert("GuideTourismPlan", null, contentValues);

    }
    // insert new row in GuideTourismPlan table at Price
    public void insertRowGuideTourismPlanPrice(double Price) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Price", Price);
        db.insert("GuideTourismPlan", null, contentValues);

    }
    // insert new row in GuideTourismPlan table at Rate
    public void insertRowGuideTourismPlanRate(double Rate) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Rate", Rate);
        db.insert("GuideTourismPlan", null, contentValues);

    }
    // insert new row in GuideTourismPlan table at Deleted
    public void insertRowDeleted(int Deleted) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Deleted", Deleted);
        db.insert("GuideTourismPlan", null, contentValues);

    }

    //Table Place
    // insert new row in Place table at Plan_ID
    public void insertRowPlacePlan_ID(String Plan_ID) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Plan_ID", Plan_ID);
        db.insert("Place", null, contentValues);

    }
    // insert new row in Place table at Location
    public void insertRowLocation(int Location) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Location", Location);
        db.insert("Place", null, contentValues);

    }
    // insert new row in Place table at Tourist_name
    public void insertRowTourist_name(String Tourist_name) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Tourist_name", Tourist_name);
        db.insert("Place", null, contentValues);

    }
    // insert new row in Place table at Description
    public void insertRowPlaceDescription(String Description) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Description", Description);
        db.insert("Place", null, contentValues);

    }
    // insert new row in Place table at Start_Date
    public void insertRowPlaceStart_Date(int Start_Date) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Start_Date", Start_Date);
        db.insert("Place", null, contentValues);

    }
    // insert new row in Place table at End_Date
    public void insertRowPlaceEnd_Date(int End_Date) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("End_Date", End_Date);
        db.insert("Place", null, contentValues);

    }

    //Table Previous Trip
    // insert new row in PreviousTrip table at Plan_ID
    public void insertRowPreviousPlan_ID(String Plan_ID) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Plan_ID", Plan_ID);
        db.insert("PreviousTrip", null, contentValues);

    }
    // insert new row in PreviousTrip table at Guide_Tourism_ID
    public void insertRowGuide_Tourism_ID(String Guide_Tourism_ID) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Guide_Tourism_ID", Guide_Tourism_ID);
        db.insert("PreviousTrip", null, contentValues);

    }
    // insert new row in PreviousTrip table at Tourist_ID
    public void insertRowTourist_ID(String Tourist_ID) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Tourist_ID", Tourist_ID);
        db.insert("PreviousTrip", null, contentValues);

    }
    // insert new row in PreviousTrip table at Start_Date
    public void insertRowPreviousTripStart_Date(int Start_Date) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Start_Date", Start_Date);
        db.insert("PreviousTrip", null, contentValues);

    }
    // insert new row in PreviousTrip table at End_Date
    public void insertRowPreviousTripEnd_Date(int End_Date) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("End_Date", End_Date);
        db.insert("PreviousTrip", null, contentValues);

    }
    // insert new row in PreviousTrip table at Price
    public void insertRowPreviousTripPrice(double Price) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Price", Price);
        db.insert("PreviousTrip", null, contentValues);

    }


    //Table Rate Person
    // insert new row in RatePerson table at Person_ID
    public void insertRowRatePersonPerson_ID(String Person_ID) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Person_ID", Person_ID);
        db.insert("RatePerson", null, contentValues);

    }
    // insert new row in RatePerson table at Rate
    public void insertRowRatePersonRate(double Rate) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Rate", Rate);
        db.insert("RatePerson", null, contentValues);

    }

    //Table Rate Place
    // insert new row in RatePlace table at Person_ID
    public void insertRowRatePlacePerson_ID(String Person_ID) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Person_ID", Person_ID);
        db.insert("RatePlace", null, contentValues);

    }
    // insert new row in RatePlace table at Rate
    public void insertRowRatePlaceRate(double Rate) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Rate", Rate);
        db.insert("RatePlace", null, contentValues);

    }

    //Table Rate Plan
    // insert new row in RatePlan table at Person_ID
    public void insertRowRatePlanPerson_ID(String Person_ID) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Person_ID", Person_ID);
        db.insert("RatePlan", null, contentValues);

    }
    // insert new row in RatePlan table at Rate
    public void insertRowRatePlanRate(double Rate) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Rate", Rate);
        db.insert("RatePlan", null, contentValues);

    }

    //Table Reservation
    // insert new row in Reservation table at Reservation_Num
    public void insertRowReservation_Num(String Reservation_Num) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Reservation_Num", Reservation_Num);
        db.insert("Reservation", null, contentValues);

    }
    // insert new row in Reservation table at Guide_Tourism_ID
    public void insertRowReservationGuide_Tourism_ID(String Guide_Tourism_ID) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Guide_Tourism_ID", Guide_Tourism_ID);
        db.insert("Reservation", null, contentValues);

    }
    // insert new row in Reservation table at Tourist_ID
    public void insertRowReservationTourist_ID(String Tourist_ID) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Tourist_ID", Tourist_ID);
        db.insert("Reservation", null, contentValues);

    }
    // insert new row in Reservation table at Plan_ID
    public void insertRowReservationPlan_ID(String Plan_ID) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Plan_ID", Plan_ID);
        db.insert("Reservation", null, contentValues);

    }
    // insert new row in Reservation table at Date
    public void insertRowReservationDate(int Date) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Date", Date);
        db.insert("Reservation", null, contentValues);

    }
    // insert new row in Reservation table at Price
    public void insertRowReservationPrice(double Price) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Price", Price);
        db.insert("Reservation", null, contentValues);

    }

    //Table Tourist
    // insert new row in Tourist table at First_Name
    public void insertRowTouristFirst_Name(String First_Name) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("First_Name", First_Name);
        db.insert("Tourist", null, contentValues);

    }
    // insert new row in Tourist table at Last_Name
    public void insertRowTouristLast_Name(String Last_Name) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Last_Name", Last_Name);
        db.insert("Tourist", null, contentValues);

    }
    // insert new row in Tourist table at User_Name
    public void insertRowTouristUser_Name(String User_Name) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("User_Name", User_Name);
        db.insert("Tourist", null, contentValues);

    }
    // insert new row in Tourist table at Birthday
    public void insertRowTouristBirthday(int Birthday) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Birthday", Birthday);
        db.insert("Tourist", null, contentValues);

    }
    // insert new row in Tourist table at Phone_Num
    public void insertRowTouristPhone_Num(String Phone_Num) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Phone_Num", Phone_Num);
        db.insert("Tourist", null, contentValues);

    }
    // insert new row in Tourist table at Email
    public void insertRowTouristEmail(String Email) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Email", Email);
        db.insert("Tourist", null, contentValues);

    }


    // Delete  Comment by Comment_Num
public void deleteComment(String CommentNum){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("delete from Comment where Comment_Num = CommentNum ");
}

//Delete Context Filtering Rate by Person_ID
public void deleteContextFilteringRate(String Person_ID){
    SQLiteDatabase db = this.getWritableDatabase();
    db.execSQL("delete from ContextFilteringRate where Person_ID = Person_ID ");
}
    //Delete Guide Tourism by ID
    public void deleteGuideTourism(String ID){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("delete from GuideTourism where ID = ID ");
    }
    //Delete GuideTourismPlan by Plan_ID
    public void deleteGuideTourismPlan(String Plan_ID){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("delete from GuideTourismPlan where Plan_ID = Plan_ID ");
    }
    //Delete Place by Plan_ID
    public void deletePlace(String Plan_ID){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("delete from Place where Plan_ID = Plan_ID ");
    }
    //Delete Previous Trip by Plan_ID
    public void deletePreviousTrip(String Plan_ID){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("delete from PreviousTrip where Plan_ID = Plan_ID ");
    }
    //Delete Rate Person by Person_ID
    public void deleteRatePerson(String Person_ID){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("delete from RatePerson where Person_ID = Person_ID ");
    }
    //Delete Rate Place by Person_ID
    public void deleteRatePlace(String Person_ID){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("delete from RatePlace where Person_ID = Person_ID ");
    }
    //Delete Rate Plan by Person_ID
    public void deleteRatePlan(String Person_ID){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("delete from RatePlan where Person_ID = Person_ID ");
    }
    //Delete Reservation by Guide_Tourism_ID
    public void deleteReservation(String Guide_Tourism_ID){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("delete from Reservation where Guide_Tourism_ID = Guide_Tourism_ID ");
    }
    //Delete Tourist by Guide_Tourism_ID
    public void deleteTourist(String ID){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("delete from Tourist where ID = ID ");
    }



    // Get Table Comment
    public ArrayList getAllComment() {

        ArrayList arrayList =new ArrayList();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res = db.rawQuery("select * from Comment",null);

        //if condition to sure the table is not empty
       if (res.moveToFirst()) {
           while (res.isAfterLast() == false) {
               arrayList.add(res.getString(res.getColumnIndex("Comment_Num")));
               arrayList.add(res.getString(res.getColumnIndex("Sender")));
               arrayList.add(res.getString(res.getColumnIndex("Receiver")));
               arrayList.add(res.getString(res.getColumnIndex("Content")));
               arrayList.add(res.getInt(res.getColumnIndex("Date")));
               res.moveToNext();
           }
       }
        return arrayList;
    }

    // Get Table Context Filtering Rate
    public ArrayList getAllContextFilteringRate() {

        ArrayList arrayList =new ArrayList();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res = db.rawQuery("select * from ContextFilteringRate",null);

        //if condition to sure the table is not empty
        if (res.moveToFirst()) {
            while (res.isAfterLast() == false) {
                arrayList.add(res.getString(res.getColumnIndex("Item_ID")));
                arrayList.add(res.getString(res.getColumnIndex("Person_ID")));
                arrayList.add(res.getDouble(res.getColumnIndex("Rate")));

                res.moveToNext();
            }
        }
        return arrayList;
    }

    // Get Table Guide Tourism
    public ArrayList getAllGuideTourism() {

        ArrayList arrayList =new ArrayList();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res = db.rawQuery("select * from GuideTourism",null);

        //if condition to sure the table is not empty
        if (res.moveToFirst()) {
            while (res.isAfterLast() == false) {
                arrayList.add(res.getString(res.getColumnIndex("ID")));
                arrayList.add(res.getString(res.getColumnIndex("First_Name")));
                arrayList.add(res.getString(res.getColumnIndex("Last_Name")));
                arrayList.add(res.getString(res.getColumnIndex("User_Name")));
                arrayList.add(res.getString(res.getColumnIndex("Profile")));
                arrayList.add(res.getString(res.getColumnIndex("Phone_Num")));
                arrayList.add(res.getString(res.getColumnIndex("Email")));
                arrayList.add(res.getDouble(res.getColumnIndex("Rate")));

                res.moveToNext();
            }
        }
        return arrayList;
    }

    // Get Table Guide Tourism Plan
    public ArrayList getAllGuideTourismPlan() {

        ArrayList arrayList =new ArrayList();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res = db.rawQuery("select * from GuideTourismPlan",null);

        //if condition to sure the table is not empty
        if (res.moveToFirst()) {
            while (res.isAfterLast() == false) {
                arrayList.add(res.getString(res.getColumnIndex("Guide_ID")));
                arrayList.add(res.getString(res.getColumnIndex("Plan_ID")));
                arrayList.add(res.getInt(res.getColumnIndex("Plan_Num")));
                arrayList.add(res.getString(res.getColumnIndex("Description")));
                arrayList.add(res.getInt(res.getColumnIndex("Retrievable")));
                arrayList.add(res.getInt(res.getColumnIndex("Return_Days")));
                arrayList.add(res.getString(res.getColumnIndex("Adequte")));
                arrayList.add(res.getInt(res.getColumnIndex("Duration_Of_Tourism")));
                arrayList.add(res.getDouble(res.getColumnIndex("Price")));
                arrayList.add(res.getDouble(res.getColumnIndex("Rate")));
                arrayList.add(res.getInt(res.getColumnIndex("Deleted")));
                res.moveToNext();
            }
        }
        return arrayList;
    }


    // Get Table Place
    public ArrayList getAllPlace() {

        ArrayList arrayList =new ArrayList();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res = db.rawQuery("select * from Place",null);

        //if condition to sure the table is not empty
        if (res.moveToFirst()) {
            while (res.isAfterLast() == false) {
                arrayList.add(res.getString(res.getColumnIndex("Plan_ID")));
                arrayList.add(res.getInt(res.getColumnIndex("Location")));
                arrayList.add(res.getString(res.getColumnIndex("Tourist_name")));
                arrayList.add(res.getString(res.getColumnIndex("Description")));
                arrayList.add(res.getInt(res.getColumnIndex("Start_Date")));
                arrayList.add(res.getInt(res.getColumnIndex("End_Date")));

                res.moveToNext();
            }
        }
        return arrayList;
    }


    // Get Previous Trip
    public ArrayList getAllPreviousTrip() {

        ArrayList arrayList =new ArrayList();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res = db.rawQuery("select * from PreviousTrip",null);

        //if condition to sure the table is not empty
        if (res.moveToFirst()) {
            while (res.isAfterLast() == false) {
                arrayList.add(res.getString(res.getColumnIndex("Plan_ID")));
                arrayList.add(res.getInt(res.getColumnIndex("Location")));
                arrayList.add(res.getString(res.getColumnIndex("Tourist_name")));
                arrayList.add(res.getString(res.getColumnIndex("Description")));
                arrayList.add(res.getInt(res.getColumnIndex("Start_Date")));
                arrayList.add(res.getInt(res.getColumnIndex("End_Date")));

                res.moveToNext();
            }
        }
        return arrayList;
    }

    // Get Rate Person
    public ArrayList getAllRatePerson() {

        ArrayList arrayList =new ArrayList();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res = db.rawQuery("select * from RatePerson",null);

        //if condition to sure the table is not empty
        if (res.moveToFirst()) {
            while (res.isAfterLast() == false) {
                arrayList.add(res.getString(res.getColumnIndex("Person_ID")));
                arrayList.add(res.getDouble(res.getColumnIndex("Rate")));

                res.moveToNext();
            }
        }
        return arrayList;
    }

    // Get Rate Place
    public ArrayList getAllRatePlace() {

        ArrayList arrayList =new ArrayList();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res = db.rawQuery("select * from RatePlace",null);

        //if condition to sure the table is not empty
        if (res.moveToFirst()) {
            while (res.isAfterLast() == false) {
                arrayList.add(res.getString(res.getColumnIndex("Person_ID")));
                arrayList.add(res.getDouble(res.getColumnIndex("Rate")));

                res.moveToNext();
            }
        }
        return arrayList;
    }

    // Get Rate Plan
    public ArrayList getAllRatePlan() {

        ArrayList arrayList =new ArrayList();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res = db.rawQuery("select * from RatePlan",null);

        //if condition to sure the table is not empty
        if (res.moveToFirst()) {
            while (res.isAfterLast() == false) {
                arrayList.add(res.getString(res.getColumnIndex("Person_ID")));
                arrayList.add(res.getString(res.getColumnIndex("Plan_ID")));
                arrayList.add(res.getDouble(res.getColumnIndex("Rate")));

                res.moveToNext();
            }
        }
        return arrayList;
    }

    // Get Reservation
    public ArrayList getAllReservation() {

        ArrayList arrayList =new ArrayList();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res = db.rawQuery("select * from Reservation",null);

        //if condition to sure the table is not empty
        if (res.moveToFirst()) {
            while (res.isAfterLast() == false) {
                arrayList.add(res.getString(res.getColumnIndex("Reservation_Num")));
                arrayList.add(res.getString(res.getColumnIndex("Guide_Tourism_ID")));
                arrayList.add(res.getString(res.getColumnIndex("Tourist_ID")));
                arrayList.add(res.getString(res.getColumnIndex("Plan_ID")));
                arrayList.add(res.getInt(res.getColumnIndex("Date")));
                arrayList.add(res.getDouble(res.getColumnIndex("Price")));

                res.moveToNext();
            }
        }
        return arrayList;
    }

    // Get Tourist
    public ArrayList getAllTourist() {

        ArrayList arrayList =new ArrayList();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res = db.rawQuery("select * from Tourist",null);

        //if condition to sure the table is not empty
        if (res.moveToFirst()) {
            while (res.isAfterLast() == false) {
                arrayList.add(res.getString(res.getColumnIndex("ID")));
                arrayList.add(res.getString(res.getColumnIndex("First_Name")));
                arrayList.add(res.getString(res.getColumnIndex("Last_Name")));
                arrayList.add(res.getString(res.getColumnIndex("User_Name")));
                arrayList.add(res.getInt(res.getColumnIndex("Birthday")));
                arrayList.add(res.getString(res.getColumnIndex("Phone_Num")));
                arrayList.add(res.getString(res.getColumnIndex("Email")));


                res.moveToNext();
            }
        }
        return arrayList;
    }


    //Get Row Comment by Comment_Num
    public ArrayList GetRowComment(String Comment_Num){
        ArrayList arrayList =new ArrayList();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res = db.rawQuery("select * from Tourist where Comment_Num=? ", new String[]{Comment_Num}); //?
        //if condition to sure the table is not empty
        if (res.moveToFirst()) {
            while (res.isAfterLast() == false) {
                arrayList.add(res.getString(res.getColumnIndex("ID")));
                arrayList.add(res.getString(res.getColumnIndex("First_Name")));
                arrayList.add(res.getString(res.getColumnIndex("Last_Name")));
                arrayList.add(res.getString(res.getColumnIndex("User_Name")));
                arrayList.add(res.getInt(res.getColumnIndex("Birthday")));
                arrayList.add(res.getString(res.getColumnIndex("Phone_Num")));
                arrayList.add(res.getString(res.getColumnIndex("Email")));


                res.moveToNext();
            }
        }
        return arrayList;
    }


}
