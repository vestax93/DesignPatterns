package builder;

public class Contact {

    private String name;
    private String number;
    private String company;
    private String title;
    private String email;
    private String website;
    private String birthday;

    private Contact(Builder builder) { //konstruktor je PRIVATE tako da mu se moze pristupiti samo iz Buildera
        this.name = builder.name;
        this.number = builder.number;
        this.company = builder.company;
        this.title = builder.title;
        this.email = builder.email;
        this.website = builder.website;
        this.birthday = builder.birthday;
    }

    public static class Builder { //builder je static
        private final String name;
        private final String number;
        private String company;
        private String title;
        private String email;
        private String website;
        private String birthday;

        public Builder(String name, String number) { //obavezna polja, setujemo u konstruktoru Buildera
            this.name = name;
            this.number = number;
        }

        public Builder company(String company){ //BEZ KLJUCNE RECI SET, setteri inace ne vracaju nista, a ova metoda vraca objekat Builder (sa najnovijim postavljenim poljem i svim prethodnim)
            this.company = company;
            return this;
        }

        public Builder title(String title){
            this.title = title;
            return this;
        }

        public Builder email(String email){
            this.email = email;
            return this;
        }

        public Builder website(String website){
            this.website = website;
            return this;
        }

        public Builder birthday(String birthday){
            this.birthday = birthday;
            return this;
        }

        public Contact build(){
            validateContact();
            return new Contact(this);
        }

        private void validateContact() {
            StringBuilder sb = new StringBuilder();

            if (name == null || name.trim().equals("") || name.length() < 2) {
                sb.append("The name must contain at least 2 characters!").append(System.lineSeparator());
            }
            if (number == null || number.trim().equals("") || number.length() < 5) {
               sb.append("The name must contain at least 5 characters!").append(System.lineSeparator());
            }
            if(sb.toString().length() > 0){
                throw new IllegalStateException(sb.toString());
            }
        }


    }

    public String getName() {
        return name;
    }



    public String getNumber() {
        return number;
    }



    public String getCompany() {
        return company;
    }

    public String getTitle() {
        return title;
    }

    public String getEmail() {
        return email;
    }

    public String getWebsite() {
        return website;
    }

    public String getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", company='" + company + '\'' +
                ", title='" + title + '\'' +
                ", email='" + email + '\'' +
                ", website='" + website + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
