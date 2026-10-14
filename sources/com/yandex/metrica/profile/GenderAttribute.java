package com.yandex.metrica.profile;

import com.yandex.metrica.impl.ob.Bf;
import com.yandex.metrica.impl.ob.C1958sf;
import com.yandex.metrica.impl.ob.C2033vf;
import com.yandex.metrica.impl.ob.Cf;
import com.yandex.metrica.impl.ob.Df;
import com.yandex.metrica.impl.ob.Ef;
import com.yandex.metrica.impl.ob.Hf;
import com.yandex.metrica.impl.ob.In;
import com.yandex.metrica.impl.ob.no;

/* JADX INFO: loaded from: classes.dex */
public class GenderAttribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2033vf f18117a = new C2033vf("appmetrica_gender", new no(), new Df());

    public enum Gender {
        MALE("M"),
        FEMALE("F"),
        OTHER("O");

        private final String mStringValue;

        Gender(String str) {
            this.mStringValue = str;
        }

        public String getStringValue() {
            return this.mStringValue;
        }
    }

    public UserProfileUpdate<? extends Hf> withValue(Gender gender) {
        return new UserProfileUpdate<>(new Ef(this.f18117a.a(), gender.getStringValue(), new In(), this.f18117a.b(), new C1958sf(this.f18117a.c())));
    }

    public UserProfileUpdate<? extends Hf> withValueIfUndefined(Gender gender) {
        return new UserProfileUpdate<>(new Ef(this.f18117a.a(), gender.getStringValue(), new In(), this.f18117a.b(), new Cf(this.f18117a.c())));
    }

    public UserProfileUpdate<? extends Hf> withValueReset() {
        return new UserProfileUpdate<>(new Bf(0, this.f18117a.a(), this.f18117a.b(), this.f18117a.c()));
    }
}
