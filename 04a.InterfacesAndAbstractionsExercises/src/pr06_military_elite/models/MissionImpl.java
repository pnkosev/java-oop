package pr06_military_elite.models;

import pr06_military_elite.enums.MissionState;

public class MissionImpl implements Mission {
    private String codeName;
    private MissionState state;

    public MissionImpl(String codeName, MissionState state) {
        this.codeName = codeName;
        this.state = state;
    }

    @Override
    public void completeMission() {
        this.state = MissionState.FINISHED;
    }

    @Override
    public String toString() {
        return String.format("Code Name: %s State: %s", this.codeName, this.state.getState());
    }

    public MissionState getState() {
        return this.state;
    }
}
