
    public class Hero {
        private String name;
        private String surname;
        private String nickname;
        private int heroID;
        private String heroType;
        private int deedTime;


        public Hero() {
            this.name = "Joe ";
            this.surname = "Black";
            this.nickname = "Flying Rocket";
            this.heroID = 123456789;
            this.heroType = "Hero";
            this.deedTime = 23;
        }

        public Hero(String inputName, String inputSurname, String inputNickname, int inputHeroID, String inputHeroType, int inputDeedTime ) {
            this.name = inputName;
            this.surname = inputSurname;
            this.nickname = inputNickname;
            this.heroID = inputHeroID;
            this.heroType = inputHeroType;
            this.deedTime = inputDeedTime;
        }




        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        public String getNickname() {
            return nickname;
        }

        public int getHeroID() {
            return heroID;
        }

        public String getHeroType() {
            return heroType;
        }

        public int getDeedTime() {
            return deedTime;
        }


        public String toString()
        {
            return "The name is: " + name + " " + surname + "His nickname is: " + nickname + " ID: " + heroID + " The deed time is: " + deedTime;
        }

        public int calculatedLevel()
        {
            int level = 0;
            if(deedTime < 20){
                level =  1;
            }
            if (deedTime >=20 && deedTime <40){
                level = 2;
            }
            if (deedTime >=40){
                level = 3;
            }
            return level;
        }

    }
