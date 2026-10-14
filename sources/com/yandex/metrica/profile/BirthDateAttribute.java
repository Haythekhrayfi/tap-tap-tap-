package com.yandex.metrica.profile;

import android.annotation.SuppressLint;
import com.yandex.metrica.impl.ob.AbstractC1909qf;
import com.yandex.metrica.impl.ob.Bf;
import com.yandex.metrica.impl.ob.C1958sf;
import com.yandex.metrica.impl.ob.C2033vf;
import com.yandex.metrica.impl.ob.Cf;
import com.yandex.metrica.impl.ob.Df;
import com.yandex.metrica.impl.ob.Ef;
import com.yandex.metrica.impl.ob.Hf;
import com.yandex.metrica.impl.ob.In;
import com.yandex.metrica.impl.ob.no;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class BirthDateAttribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2033vf f18114a = new C2033vf("appmetrica_birth_date", new no(), new Df());

    @SuppressLint({"SimpleDateFormat"})
    public UserProfileUpdate<? extends Hf> a(Calendar calendar, String str, AbstractC1909qf abstractC1909qf) {
        return new UserProfileUpdate<>(new Ef(this.f18114a.a(), new SimpleDateFormat(str).format(calendar.getTime()), new In(), new no(), abstractC1909qf));
    }

    public final Calendar b(int i10) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i10);
        return gregorianCalendar;
    }

    public UserProfileUpdate<? extends Hf> withAge(int i10) {
        return a(b(Calendar.getInstance(Locale.US).get(1) - i10), "yyyy", new C1958sf(this.f18114a.c()));
    }

    public UserProfileUpdate<? extends Hf> withAgeIfUndefined(int i10) {
        return a(b(Calendar.getInstance(Locale.US).get(1) - i10), "yyyy", new Cf(this.f18114a.c()));
    }

    public UserProfileUpdate<? extends Hf> withBirthDate(int i10) {
        return a(b(i10), "yyyy", new C1958sf(this.f18114a.c()));
    }

    public UserProfileUpdate<? extends Hf> withBirthDate(int i10, int i11) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i10);
        gregorianCalendar.set(2, i11 - 1);
        gregorianCalendar.set(5, 1);
        return a(gregorianCalendar, "yyyy-MM", new C1958sf(this.f18114a.c()));
    }

    public UserProfileUpdate<? extends Hf> withBirthDate(Calendar calendar) {
        return a(calendar, "yyyy-MM-dd", new C1958sf(this.f18114a.c()));
    }

    public UserProfileUpdate<? extends Hf> withBirthDateIfUndefined(int i10) {
        return a(b(i10), "yyyy", new Cf(this.f18114a.c()));
    }

    public UserProfileUpdate<? extends Hf> withBirthDateIfUndefined(int i10, int i11) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i10);
        gregorianCalendar.set(2, i11 - 1);
        gregorianCalendar.set(5, 1);
        return a(gregorianCalendar, "yyyy-MM", new Cf(this.f18114a.c()));
    }

    public UserProfileUpdate<? extends Hf> withBirthDateIfUndefined(Calendar calendar) {
        return a(calendar, "yyyy-MM-dd", new Cf(this.f18114a.c()));
    }

    public UserProfileUpdate<? extends Hf> withValueReset() {
        return new UserProfileUpdate<>(new Bf(0, this.f18114a.a(), new no(), new Df()));
    }

    public UserProfileUpdate<? extends Hf> withBirthDate(int i10, int i11, int i12) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i10);
        gregorianCalendar.set(2, i11 - 1);
        gregorianCalendar.set(5, i12);
        return a(gregorianCalendar, "yyyy-MM-dd", new C1958sf(this.f18114a.c()));
    }

    public UserProfileUpdate<? extends Hf> withBirthDateIfUndefined(int i10, int i11, int i12) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i10);
        gregorianCalendar.set(2, i11 - 1);
        gregorianCalendar.set(5, i12);
        return a(gregorianCalendar, "yyyy-MM-dd", new Cf(this.f18114a.c()));
    }
}
