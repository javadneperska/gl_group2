import java.util.Arrays;

public class Person {

    public static int personCount = 0;
    private String name;

    private String[] skills;

    public Person(String name, String[] skills) {
        this.name = name;
        this.skills = skills;
        for (int i = 0; i < this.skills.length; i++) {
            this.skills[i] = this.skills[i].toLowerCase();
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public boolean isMatch(String requiredSkill) {
        for (String skill : this.skills) {
            if (requiredSkill.equalsIgnoreCase(skill)) {
                return true;
            }
        }
        return false;
    }

    public String getOneStringSkills() {
        return Arrays.toString(this.skills).replace(", ", "").
                replaceAll("\\[", "").replaceFirst("\\]", "");
    }

    public String getSkillsWithoutLetter(String letter) {
        for (String skill : this.skills) {
            if (!skill.contains(letter)) {
                return skill;
            }
        }
        return null;
    }

    public String getSkillWhichStartsWith(String beginning){
        for (String skill : this.skills) {
            if (skill.startsWith(beginning)) {
                return skill;
            }
        }
        return null;
    }

    public String getSkillWhichEndsWith(String ending){
        for (String skill : this.skills) {
            if (skill.endsWith(ending)) {
                return skill;
            }
        }
        return null;
    }
}

