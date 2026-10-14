package com.inscode.autoclicker.ui.prepare;

import ch.qos.logback.core.CoreConstants;
import defpackage.a;
import fd.j0;
import h0.f;
import l1.e;
import vc.g;

/* JADX INFO: loaded from: classes2.dex */
public final class PrepareScreen {
    public static final int ACCESSIBILITY_SERVICE = 1;
    public static final int BATTERY_OPTIMIZATION = 2;
    public static final Companion Companion = new Companion(null);
    public static final int NOTIFICATIONS = 3;
    private final int background;
    private final String description;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f13389id;
    private final Integer image;
    private final String number;
    private final String title;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public PrepareScreen(int i10, String str, String str2, String str3, Integer num, int i11) {
        j0.i(str, "number");
        j0.i(str2, "title");
        j0.i(str3, "description");
        this.f13389id = i10;
        this.number = str;
        this.title = str2;
        this.description = str3;
        this.image = num;
        this.background = i11;
    }

    public /* synthetic */ PrepareScreen(int i10, String str, String str2, String str3, Integer num, int i11, int i12, g gVar) {
        this(i10, str, str2, str3, (i12 & 16) != 0 ? null : num, i11);
    }

    public static /* synthetic */ PrepareScreen copy$default(PrepareScreen prepareScreen, int i10, String str, String str2, String str3, Integer num, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = prepareScreen.f13389id;
        }
        if ((i12 & 2) != 0) {
            str = prepareScreen.number;
        }
        String str4 = str;
        if ((i12 & 4) != 0) {
            str2 = prepareScreen.title;
        }
        String str5 = str2;
        if ((i12 & 8) != 0) {
            str3 = prepareScreen.description;
        }
        String str6 = str3;
        if ((i12 & 16) != 0) {
            num = prepareScreen.image;
        }
        Integer num2 = num;
        if ((i12 & 32) != 0) {
            i11 = prepareScreen.background;
        }
        return prepareScreen.copy(i10, str4, str5, str6, num2, i11);
    }

    public final int component1() {
        return this.f13389id;
    }

    public final String component2() {
        return this.number;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.description;
    }

    public final Integer component5() {
        return this.image;
    }

    public final int component6() {
        return this.background;
    }

    public final PrepareScreen copy(int i10, String str, String str2, String str3, Integer num, int i11) {
        j0.i(str, "number");
        j0.i(str2, "title");
        j0.i(str3, "description");
        return new PrepareScreen(i10, str, str2, str3, num, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrepareScreen)) {
            return false;
        }
        PrepareScreen prepareScreen = (PrepareScreen) obj;
        return this.f13389id == prepareScreen.f13389id && j0.d(this.number, prepareScreen.number) && j0.d(this.title, prepareScreen.title) && j0.d(this.description, prepareScreen.description) && j0.d(this.image, prepareScreen.image) && this.background == prepareScreen.background;
    }

    public final int getBackground() {
        return this.background;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getId() {
        return this.f13389id;
    }

    public final Integer getImage() {
        return this.image;
    }

    public final String getNumber() {
        return this.number;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iA = e.a(this.description, e.a(this.title, e.a(this.number, Integer.hashCode(this.f13389id) * 31, 31), 31), 31);
        Integer num = this.image;
        return Integer.hashCode(this.background) + ((iA + (num == null ? 0 : num.hashCode())) * 31);
    }

    public String toString() {
        StringBuilder sbA = a.a("PrepareScreen(id=");
        sbA.append(this.f13389id);
        sbA.append(", number=");
        sbA.append(this.number);
        sbA.append(", title=");
        sbA.append(this.title);
        sbA.append(", description=");
        sbA.append(this.description);
        sbA.append(", image=");
        sbA.append(this.image);
        sbA.append(", background=");
        return f.a(sbA, this.background, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
