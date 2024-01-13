package StudentEmail;



public class StudentEmail
{
   
   
   private String id;
   private String name;
   private String phone;
   private String mail;

   public StudentEmail ()
   {
       
      id   = "";
      name = "";
      phone = "";
      mail = "";
   }

   public StudentEmail (String id,String name,  String phone, String mail)
                        throws StudentEmailException
   {
      // Remove elading and trailing spaces, tabs.
      id   = id.trim ();
      name = name.trim ();      
      phone = phone.trim();
      mail = mail.trim();

      
     if (id.length () == 0)
      {
         throw new StudentEmailException ("Error: Id cannot be blank.");
      }
      
     else if (name.length () == 0)
      {
         throw new StudentEmailException ("Error: Name cannot be blank.");
      }

      else if (phone.length () == 0)
      {
         throw new StudentEmailException ("Error: Phone Number cannot be blank.");
      }

      else if (mail.length () == 0)
      {
         throw new StudentEmailException ("Error: Email cannot be blank.");
      }


      else
      {
         // All is OK, set class data to the values passed in.
         
         this.id   = id;
         this.name = name;
         this.phone = phone;
         this.mail = mail;
      }
   }

   public String getId ()
   {
      return id;
   }

   public void setId (String id)
   {
      this.id = id;
   }
   
   public String getName ()
   {
      return name;
   }
   
    public void setName (String name)
   {
      this.name = name;
   }

  
   public String getPhone ()
   {
      return phone;
   }
   
    public void setPhone (String phone)
   {
      this.phone = phone;
   }
    public String getMail ()
   {
      return mail;
   }
   
    public void setMail (String mail)
   {
      this.mail = mail;
   }
   
   

   @Override
   public String toString ()
   {
      return id + "\t" + name + "\t" + phone + "\t" + mail + "\t" ;
   }

} 