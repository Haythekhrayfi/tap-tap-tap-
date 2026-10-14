package com.google.android.play.core.splitinstall;

import android.util.Log;
import ch.qos.logback.core.joran.action.Action;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
final class az {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final XmlPullParser f12420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f12421b = new g();

    public az(XmlPullParser xmlPullParser) {
        this.f12420a = xmlPullParser;
    }

    private final String a(String str) {
        for (int i10 = 0; i10 < this.f12420a.getAttributeCount(); i10++) {
            if (this.f12420a.getAttributeName(i10).equals(str)) {
                return this.f12420a.getAttributeValue(i10);
            }
        }
        return null;
    }

    private final void b() throws XmlPullParserException, IOException {
        int i10 = 1;
        while (i10 != 0) {
            int next = this.f12420a.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    public final h a() {
        String strA;
        while (this.f12420a.next() != 1) {
            try {
                if (this.f12420a.getEventType() == 2) {
                    if (this.f12420a.getName().equals("splits")) {
                        while (this.f12420a.next() != 3) {
                            if (this.f12420a.getEventType() == 2) {
                                if (!this.f12420a.getName().equals("module") || (strA = a("name")) == null) {
                                    b();
                                } else {
                                    while (this.f12420a.next() != 3) {
                                        if (this.f12420a.getEventType() == 2) {
                                            if (this.f12420a.getName().equals("language")) {
                                                while (this.f12420a.next() != 3) {
                                                    if (this.f12420a.getEventType() == 2) {
                                                        if (this.f12420a.getName().equals("entry")) {
                                                            String strA2 = a(Action.KEY_ATTRIBUTE);
                                                            String strA3 = a("split");
                                                            b();
                                                            if (strA2 != null && strA3 != null) {
                                                                this.f12421b.a(strA, strA2, strA3);
                                                            }
                                                        } else {
                                                            b();
                                                        }
                                                    }
                                                }
                                            } else {
                                                b();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        b();
                    }
                }
            } catch (IOException | IllegalStateException | XmlPullParserException e10) {
                Log.e("SplitInstall", "Error while parsing splits.xml", e10);
                return null;
            }
        }
        return this.f12421b.a();
    }
}
