package com.yandex.metrica.impl.ob;

import android.widget.CheckBox;
import android.widget.Chronometer;
import android.widget.DigitalClock;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextClock;
import android.widget.TextView;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ol, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1865ol implements Fl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<Class> f17024a;

    public C1865ol() {
        HashSet hashSet = new HashSet();
        this.f17024a = hashSet;
        hashSet.add(EditText.class);
        hashSet.add(Chronometer.class);
        hashSet.add(DigitalClock.class);
        hashSet.add(TextClock.class);
        hashSet.add(RadioButton.class);
        hashSet.add(CheckBox.class);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1692hm
    public Wl.b a() {
        return Wl.b.IRRELEVANT_CLASS;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1692hm
    public boolean a(TextView textView) {
        TextView textView2 = textView;
        Iterator<Class> it = this.f17024a.iterator();
        while (it.hasNext()) {
            if (it.next().isInstance(textView2)) {
                return true;
            }
        }
        return false;
    }
}
