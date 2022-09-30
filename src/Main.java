public class Main {
    public static void main(String[] args) {

        Car ladaGrande = new Car("Lada", "Grande", 1.7, "жёлтый", 2015, "Россия",
                "автомат", "седан", "Т001СУ123", 5, "летняя", 200, true);
        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "чёрный", 2020, "Германия",
                "автомат", "хэтчбек", "Т003СК023", 4, "летняя", 250, false);
        Car bmwZ8 = new Car("BMW", "Z8", 3.0, "чёрный", 2021, "Германия",
                "ручная", "лифтбэк", "В105СУ031", 5, "зимняя", 300, false);
        Car kiaSportage = new Car("KIA", "Sportage 4 поколение", 2.4, "красный", 2018, "Южная Корея",
                "гибрид", "кабриолет", "К777СУ177", 8, "зимняя", 260, true);
        Car hyundaiAvante = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея",
                "ручная", "купе", "Т548СУ001", 2, "летняя", 240, false);

        System.out.println(ladaGrande);
        System.out.println(audiA8);
        System.out.println(bmwZ8);
        System.out.println(kiaSportage);
        System.out.println(hyundaiAvante);
        System.out.println();

        Train smallow = new Train("Ласточка", "В-901", 2011,
                "Россия", 3500.00, "3 часа 15 минут",
                "Белорусский вокзал", "Минск", 11, 301);
        Train leningrad = new Train("Ленинград", "D-125", 2019,
                "Россия", 1700.00, "5 часов 30 минут",
                "Ленинградский вокзал", "Ленинград", 8, 270);

        System.out.println(smallow);
        System.out.println(leningrad);
        System.out.println();

        Bus kursor = new Bus("Курсор", "Лиаз-4292", 2015, "Италия",
                "сине - серый", 85);
        Bus mercedezBenz = new Bus("Mercedez-Benz", "Sprinter", 2006, "Германия",
                "белый", 110);
        Bus hyundaiH350 = new Bus("Hyundai", "H350", 2008, "Корея",
                "черный", 80);

        System.out.println(kursor);
        System.out.println(mercedezBenz);
        System.out.println(hyundaiH350);

        System.out.println();
        smallow.refill();
        mercedezBenz.refill();
        ladaGrande.refill();
        audiA8.refill();
        bmwZ8.refill();
        kiaSportage.refill();
        hyundaiAvante.refill();
        System.out.println();

        Herbivores gazelle = new Herbivores("газель Булавочка", 5, "Северная Африка",
                50, "трава, листья");
        Herbivores giraffe = new Herbivores("жираф Везунчик", 3, "Камбоджа",
                55, "листья деревьев");
        Herbivores horse = new Herbivores("лошадь Лакомка", 7, "Нидерланды",
                60, "сено");
        if (gazelle.equals(giraffe)) {
            giraffe = gazelle;
        }
        if (gazelle.equals(horse)) {
            horse = gazelle;
        }
        if (giraffe.equals(horse)) {
            horse = giraffe;
        }

        Predators hyena = new Predators("гиена Акелла", 1, "Северная Каролина",
                60, "мелкие позвоночные");
        Predators tiger = new Predators("тигр Шархан", 2, "Австралия",
                49, "кабаны, олени, косули");
        Predators bear = new Predators("медведь Винни-Пух", 3, "Северный Полюс",
                40, "ягоды, мясо оленей, насекомых");
        if (hyena.equals(tiger)) {
            tiger = hyena;
        }
        if (hyena.equals(bear)) {
            bear = hyena;
        }
        if (tiger.equals(bear)) {
            bear = tiger;
        }

        Amphibians frog = new Amphibians("лягушка Путещественница", 4, "болото, влажные леса");
        Amphibians freshWater = new Amphibians("уж пресноводный Каа", 5, "Азия");
        if (frog.equals(freshWater)) {
            freshWater = frog;
        }

        Flightless peacock = new Flightless("павлин Красавчик", 6, "Южная Азия", "немного летает");
        Flightless penquin = new Flightless("пингвин Толстяк", 7, "Новая Зеландия", "переваливаясь с боку на бок");
        Flightless dodoBird = new Flightless("птица додо Быструшка", 8, "Маскаренские острова", "прыгает как гусь");
        if (peacock.equals(penquin)) {
            penquin = peacock;
        }
        if (peacock.equals(dodoBird)) {
            dodoBird = peacock;
        }
        if (penquin.equals(dodoBird)) {
            dodoBird = penquin;
        }

        Flying seagull = new Flying("чайка Прекрасныш", 9, "возле рек и пресных водоемов", "плавает");
        Flying albatross = new Flying("альбатрос Длиннонос", 10, "Южный океан", "вразвалочку");
        Flying falcon = new Flying("сокол Волшебник", 11, "от тундр до пустынь", "быстро летает");
        if (seagull.equals(albatross)) {
            albatross = seagull;
        }
        if (seagull.equals(falcon)) {
            falcon = seagull;
        }
        if (albatross.equals(falcon)) {
            falcon = albatross;
        }

        System.out.println(gazelle);
        System.out.println(giraffe);
        System.out.println(horse);
        System.out.println(hyena);
        System.out.println(tiger);
        System.out.println(bear);
        System.out.println(frog);
        System.out.println(freshWater);
        System.out.println(peacock);
        System.out.println(penquin);
        System.out.println(dodoBird);
        System.out.println(seagull);
        System.out.println(albatross);
        System.out.println(falcon);

    }
}