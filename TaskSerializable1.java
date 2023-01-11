import java.io.*;

public class TaskSerializable1 {
    public class Animal {
        public Animal() {
        }
    }

    public class Halter {

    }

    public static class Horse implements Serializable {
        private transient Halter halter;
        public String name;

        public Horse(String name) {
            this.name = name;
        }

        public void serialize (Horse horse){
            try(FileOutputStream fis = new FileOutputStream("horse.ser");
                ObjectOutputStream ois = new ObjectOutputStream(fis)){
                ois.writeObject(horse);
            }catch (IOException e){
                System.out.println(e.getMessage());
            }
        }

        public Horse deserialize (){
            try(FileInputStream fis = new FileInputStream("horse.ser");
                ObjectInputStream ois = new ObjectInputStream(fis)){
                return (Horse)(ois.readObject());
            }catch (IOException | ClassNotFoundException e){
                System.out.println(e.getMessage());
            }
            return null;
        }
    }
    public class SerializableHorse {
        public static void main(String[] args) {
            Horse horse = new Horse ("name");
            horse.serialize(horse);
            horse.deserialize();
        }
    }
}
