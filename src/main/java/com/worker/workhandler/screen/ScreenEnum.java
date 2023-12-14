package com.worker.workhandler.screen;

public enum ScreenEnum {
    MAIN;

    private ScreenDTO screenDTO;
    public ScreenDTO getScreenDTO() {
        return screenDTO;
    }
    public void setScreenDTO(ScreenDTO screenDTO) {
        this.screenDTO = screenDTO;
    }
}
