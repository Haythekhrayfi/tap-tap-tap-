package com.yandex.metrica.profile;

import androidx.activity.j;
import com.yandex.metrica.impl.ob.C2063wf;
import com.yandex.metrica.impl.ob.C2088xf;
import com.yandex.metrica.impl.ob.Gn;
import com.yandex.metrica.impl.ob.Im;
import com.yandex.metrica.impl.ob.Nn;

/* JADX INFO: loaded from: classes.dex */
public class Attribute {
    public static BirthDateAttribute birthDate() {
        return new BirthDateAttribute();
    }

    public static BooleanAttribute customBoolean(String str) {
        return new BooleanAttribute(str, new C2063wf(), new C2088xf(new Gn(100)));
    }

    public static CounterAttribute customCounter(String str) {
        return new CounterAttribute(str, new C2063wf(), new C2088xf(new Gn(100)));
    }

    public static NumberAttribute customNumber(String str) {
        return new NumberAttribute(str, new C2063wf(), new C2088xf(new Gn(100)));
    }

    public static StringAttribute customString(String str) {
        return new StringAttribute(str, new Nn(200, j.a("String attribute \"", str, "\""), Im.g()), new C2063wf(), new C2088xf(new Gn(100)));
    }

    public static GenderAttribute gender() {
        return new GenderAttribute();
    }

    public static NameAttribute name() {
        return new NameAttribute();
    }

    public static NotificationsEnabledAttribute notificationsEnabled() {
        return new NotificationsEnabledAttribute();
    }
}
