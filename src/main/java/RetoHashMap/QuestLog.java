package RetoHashMap;

import java.util.HashMap;

public class QuestLog {
    private HashMap<String, Quest> quests;  // Mapa: ID → Quest

    // El constructor no hace falta modificarlo
    public QuestLog() {
        this.quests = new HashMap<>();
    }

    public void addQuest(Quest quest) {
        //Validar si ya existe
        this.quests.putIfAbsent(quest.getId(), quest);
    }

    public Quest getQuest(String questId) {
        return this.quests.get(questId);
    }

    public void completeQuest(String questId) {
        if(this.getQuest(questId)!= null){
            this.getQuest(questId).setCompleted(true);
        }
    }

    // Este getter no lo vamos a modificar
    public HashMap<String, Quest> getQuests() {
        return quests;
    }

}