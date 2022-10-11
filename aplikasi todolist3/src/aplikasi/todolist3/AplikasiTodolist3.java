/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aplikasi.todolist3;

/**
 *
 * @author hp
 */
public class AplikasiTodolist3 {
public static String[]model = new String[10];
    
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);
    
     
    public static void main(String[] args) {
        testViewShowTodoList();
        
    }
        
    //Menampilkan todo list   
    public static void showTodoList(){
         for (int i = 0; i<model.length;i++){
            String todo = model[i];
            int no = i+1;
            
            if(todo!= null){
                System.out.println(no+"."+todo);
            }
         }
    }
    
    public static void testShowTodoList(){
        showTodoList();
    }
    
    //Menambah todo ke list
    public static void addTodoList(String todo){
    

        // tambahkan ke posisi yang data array nya null
        for (int i = 0; i<model.length; i++){ 
        if (model[i] == null) {
            model[i] = todo;
            break;
        }
    }
}
    
    public static void addTodoList2(String todo){
        // cek apakah model penuh?
        boolean isFull = true;
        for (int i = 0; i<model.length; i++){
            if (model[i] == null){
            //model masih ada yang kosong
            isFull = false;
            break;
        }
    }
    if(isFull){
       String[] temp = model;
       model = new String[model.length * 2];
            
        for (int i = 0; i<temp.length; i++){
           model[i] = temp[i];
        }
    }
    
    //tambahkan ke posisi yang data array nya null
    for (int i = 0; i<model.length; i++){
        if (model[i] == null){
            model[i] = todo;
            break;
        }
    }      
}  
    
    public static void testAddTodoList(){
        for (int i = 0; i < 25; i++){
            addTodoList("Contoh Todo Ke." + i);
        }
        showTodoList();
    }

    //Menghapus todo dari list
    public static boolean removeTodoList(Integer number){
        if ((number - 1) >= model.length){
            return false;
        } else if (model[number - 1] == null){
            return false;
        } else {
            for (int i = (number - 1); i <model.length; i++){
              if (i == (model.length - 1)){
                  model[i] = null;
              } else {
                  model[i] = model[i + 1];
              }
            }
            return true ;
        }
    }
    
    public static void testRemoveTodoList(){
        addTodoList("satu");
        addTodoList("dua");
        addTodoList("tiga");
        addTodoList("empat");
        addTodoList("lima");
        
        boolean result = removeTodoList(20);
        System.out.println(result);
        
        result = removeTodoList(7);
        System.out.println(result);
        
        result = removeTodoList(2);
        System.out.println();
        
        showTodoList();
    }
    
    public static String input(String info){
        System.out.println(info + " : ");
        String data = scanner.nextLine();
        return data;
    }
    
    public static void testInput(){
        String name = input(" Nama ");
        System.out.println(" hi " + name);
        
        String channel = input("chanel");
        System.out.println(channel);
        
    }
    
    /**
     * Menampilkan view menambahkan todo ke list
     */
    public static void viewAddTodoList(){
        System.out.println("menambah TODOLIST");
        
        String todo = input("Todo (x jika Batal)");
        
        if (todo.equals("x")){
            //batal
        } else {
            addTodoList(todo);
        }
        
    }
    public static void testViewTodoList(){
        addTodoList("satu");
        addTodoList("dau");
        
        viewAddTodoList();
        
        showTodoList();
    }
    public static void viewRemoveTodolist(){
        addTodoList("satu");
        addTodoList("daua");
        addTodoList("tiga0");
        addTodoList("empat");
        addTodoList("lima");
        viewTodoList();
    }
    public static void viewTodoList(){
        while (true){
            showTodoList();
            
            System.out.println("MENU : ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("k. Keluar");
            
            String input = input ("pilih");
            if (input.equals("1")){
                
                
                viewAddTodoList();
                
            } else if (input.equals("2")){
                viewRemoveTodolist();
            } else if (input.equals("x")){
                break;
            } else {
                System.out.println("pilihan tidak dimengerti");
            }
        }
    }
    
    //Menampilkan view menghapus todolist
     public static void viewShowTodoList(){
         while (true){
             showTodoList();
             
             System.out.println("MENU");
             System.out.println("1. tambah");
             System.out.println("2. hapus");
             System.out.println("x. keluar");
             
             String input = input ("pilih");
             if (input.equals("1")) {
                viewAddTodoList();
                
         } else if (input.equals("2")){
             viewRemoveTodoList();
             
         } else if (input.equals("x")){
                 break;
                 }else {
                 System.out.println("pilihan tidak dimengerti");
                 }
         }
     }

     public static void testViewShowTodoList(){
        addTodoList("satu");
        addTodoList("dua");
        addTodoList("tiga");
        addTodoList("empat");
        addTodoList("lima");
        
        viewShowTodoList();
        
        
     }
     /** 
      * menampilkan view menambahkan todo list
      */
     
     {
         
     }
     public static void testViewRemoveTodoList(){
         addTodoList("satu");
         addTodoList("dua");
         addTodoList("tiga");
         
         showTodoList();
         
         viewRemoveTodoList();
         
         showTodoList();
         
     }
      
    
         
     

    private static void viewRemoveTodoList() {
        System.out.println ("MENGAHPUS TODOLIST");
        
        String number = input ("Nomor yang dihapus (x jika batal)");
        
        if (number.equals("x")){
            //batal
        } else {
            boolean success = removeTodoList(Integer.valueOf(number));
            if (!success){
                System.out.println("gagal menghapus todolist : "+ number);
            }
        
    }
        
    }
}
