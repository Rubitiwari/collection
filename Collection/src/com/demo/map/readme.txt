

//Map   -- It stores data in key value format. 

    Key== Value 
    
   Map is  a part of Collection Framework Not Collection Interface. 
   
  so there is another interface i.e. java.util.Map<K,V>
  data stores into key value format where key and value both must be object. 
     
  // Key must be unique  where value can be duplicate for different key. 
     
 // key must be unique means object (key) must uses hashCode() and equalS() method to  proide uniqueness. 
      
 
 // in case of sorting data will be sorted by key  instead  of value. 
  it means key (object) must use comparable if it is realated to sorting.  
  
   // in map we use put method to add data instead of add method( which is available in set and list) 
   //     
     
     
       Map 
         HashMap    ---- does not maintain order  
         HashTable(Thread safe)  ---- ---- It also does not maintain order used in thread safe envirmnt. 
         LinkedHashMap  ===  -- maintains order 
         TreeMap ------   sorts data according to key.(natural order)
         
          
         java.util.concurrent
         ConcurrentHashMap   ? 
         HashTable  ??  
         
      
     
     