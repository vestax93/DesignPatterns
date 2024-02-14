package builder;

import java.util.*;

public class Main {

    private static final String CREATE_COMMAND = "CREATE";
    private static final String CONTACT_INFO_COMMAND = "INFO";
    private static final String DELETE_CONTACT_COMMAND = "DELETE";
    private static final String PHONEBOOK_COMMAND = "PHONEBOOK";
    private static final String END_COMMAND = "END";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Phonebook phonebook = new Phonebook();

        String command;
        while(!END_COMMAND.equals(command = sc.nextLine())){
            switch(command){
                case CREATE_COMMAND:
                    List<String> contactInfo = readContactInfo(sc);

                    Contact contact = new Contact.Builder( //pravimo Buildera koji je static
                            contactInfo.get(0), contactInfo.get(1)) // obavezna polja su u konsntruktoru builder-a /*Builder ima name i number*/
                            .company(contactInfo.get(2)) //nadogradjujemo polje po polje iz niza koji je korisnik uneo /*Builder ima name, number i company*/
                            .title(contactInfo.get(3)) /*Builder ima name, number, company i title*/
                            .email(contactInfo.get(4))
                            .website(contactInfo.get(5))
                            .birthday(contactInfo.get(6))
                            .build(); //od Builder-a dobijamo instancu Contact-a
                    phonebook.addContact(contact);
                    break;
                case CONTACT_INFO_COMMAND:
                    String name = sc.nextLine();
                    System.out.println(phonebook.getContactByName(name));
                    break;
                case DELETE_CONTACT_COMMAND:
                    String nameToDelete = sc.nextLine();
                    System.out.println(phonebook.deleteContactByName(nameToDelete));
                    break;
                case PHONEBOOK_COMMAND:
                    phonebook.getAllContacts().stream().forEach(t -> System.out.println(t.toString()));
            }

        }
    }

    private static List<String> readContactInfo(Scanner input) {
        List<String> contactInfo = new ArrayList<>();

        System.out.print("Name: ");
        contactInfo.add(input.nextLine());

        System.out.print("Number: ");
        contactInfo.add(input.nextLine());

        System.out.print("Company: ");
        contactInfo.add(input.nextLine());

        System.out.print("Title: ");
        contactInfo.add(input.nextLine());

        System.out.print("Email: ");
        contactInfo.add(input.nextLine());

        System.out.print("Website: ");
        contactInfo.add(input.nextLine());

        System.out.print("Birthday: ");
        contactInfo.add(input.nextLine());

        return contactInfo;
    }
}
