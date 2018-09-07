import java.util.*;

public class Band {
    private List<StringedInstrument> musicians;

    public Band() {
        this.musicians = new ArrayList<>();
    }

    public void addMusician(StringedInstrument stringedInstrument) {
        this.musicians.add(stringedInstrument);
    }

    public void removeMusician(String instrument) {
        for (int i = 0; i < musicians.size(); i++) {
            if (musicians.get(i).getName().equals(instrument)) {
                musicians.remove(i);
                i--;
            }

        }
    }

    public void concert() {
        if (musicians.size() > 0) {
            System.out.println("The " + musicians.size() + " members band started the show");
            for (StringedInstrument musician : musicians) {
                musician.play();
            }
        } else {
            System.out.println("The band disbanded so the concert is missed :(");
        }

    }

    public StringedInstrument getTheLessStringedInstrument() {
        StringedInstrument lessStringed = musicians.get(0);

        for (StringedInstrument musician : musicians) {
            if (lessStringed.getNumberOfStrings() > musician.getNumberOfStrings()) {
                lessStringed = musician;
            }
        }
        return lessStringed;
    }

    public StringedInstrument getTheMostStringedInstrument() {
        StringedInstrument mostStringed = musicians.get(0);

        for (StringedInstrument musician : musicians) {
            if (mostStringed.getNumberOfStrings() < musician.getNumberOfStrings()) {
                mostStringed = musician;
            }
        }
        return mostStringed;
    }

    public String getTheFavoriteInstrument() {
        Map<String, Integer> instruments = new HashMap<String, Integer>();

        for (StringedInstrument musician : musicians) {
            Integer countIsntruments = instruments.get(musician.getName());

            if (countIsntruments == null) {
                countIsntruments = 1;
            }
            instruments.put(musician.getName(), countIsntruments + 1);
        }
        Map.Entry<String, Integer> max = null;
        for (Map.Entry<String, Integer> authorWithCount : instruments.entrySet()) {
            if (max == null || max.getValue() < authorWithCount.getValue()) {
                max = authorWithCount;
            }
        }

        return max.getKey();

    }
}
