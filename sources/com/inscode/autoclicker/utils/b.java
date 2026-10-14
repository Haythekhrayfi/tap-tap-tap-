package com.inscode.autoclicker.utils;

/* JADX INFO: loaded from: classes2.dex */
public enum b {
    HOME_BUTTON(10),
    APPS_BUTTON(20),
    BACK_BUTTON(30),
    SCREENSHOT_BUTTON(40),
    NONE(50);

    private final int type;

    b(int i10) {
        this.type = i10;
    }

    public final int getType() {
        return this.type;
    }
}
