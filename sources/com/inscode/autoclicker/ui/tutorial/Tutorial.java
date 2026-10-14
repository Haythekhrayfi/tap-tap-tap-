package com.inscode.autoclicker.ui.tutorial;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class Tutorial {
    private final String key;

    public Tutorial(String str) {
        j0.i(str, Action.KEY_ATTRIBUTE);
        this.key = str;
    }

    public static /* synthetic */ Tutorial copy$default(Tutorial tutorial, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = tutorial.key;
        }
        return tutorial.copy(str);
    }

    public final String component1() {
        return this.key;
    }

    public final Tutorial copy(String str) {
        j0.i(str, Action.KEY_ATTRIBUTE);
        return new Tutorial(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Tutorial) && j0.d(this.key, ((Tutorial) obj).key);
    }

    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        return this.key.hashCode();
    }

    public String toString() {
        return s.a.a(defpackage.a.a("Tutorial(key="), this.key, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
