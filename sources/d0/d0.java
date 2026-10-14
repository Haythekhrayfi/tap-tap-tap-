package d0;

import android.app.Person;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import ch.qos.logback.core.joran.action.Action;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f28488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IconCompat f28489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f28490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f28491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f28492e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f28493f;

    public static class a {
        public static d0 a(PersistableBundle persistableBundle) {
            c cVar = new c();
            cVar.f28494a = persistableBundle.getString("name");
            cVar.f28496c = persistableBundle.getString("uri");
            cVar.f28497d = persistableBundle.getString(Action.KEY_ATTRIBUTE);
            cVar.f28498e = persistableBundle.getBoolean("isBot");
            cVar.f28499f = persistableBundle.getBoolean("isImportant");
            return new d0(cVar);
        }

        public static PersistableBundle b(d0 d0Var) {
            PersistableBundle persistableBundle = new PersistableBundle();
            CharSequence charSequence = d0Var.f28488a;
            persistableBundle.putString("name", charSequence != null ? charSequence.toString() : null);
            persistableBundle.putString("uri", d0Var.f28490c);
            persistableBundle.putString(Action.KEY_ATTRIBUTE, d0Var.f28491d);
            persistableBundle.putBoolean("isBot", d0Var.f28492e);
            persistableBundle.putBoolean("isImportant", d0Var.f28493f);
            return persistableBundle;
        }
    }

    public static class b {
        public static d0 a(Person person) {
            c cVar = new c();
            cVar.f28494a = person.getName();
            cVar.f28495b = person.getIcon() != null ? IconCompat.b(person.getIcon()) : null;
            cVar.f28496c = person.getUri();
            cVar.f28497d = person.getKey();
            cVar.f28498e = person.isBot();
            cVar.f28499f = person.isImportant();
            return new d0(cVar);
        }

        public static Person b(d0 d0Var) {
            Person.Builder name = new Person.Builder().setName(d0Var.f28488a);
            IconCompat iconCompat = d0Var.f28489b;
            return name.setIcon(iconCompat != null ? iconCompat.l() : null).setUri(d0Var.f28490c).setKey(d0Var.f28491d).setBot(d0Var.f28492e).setImportant(d0Var.f28493f).build();
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CharSequence f28494a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public IconCompat f28495b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f28496c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f28497d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f28498e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f28499f;
    }

    public d0(c cVar) {
        this.f28488a = cVar.f28494a;
        this.f28489b = cVar.f28495b;
        this.f28490c = cVar.f28496c;
        this.f28491d = cVar.f28497d;
        this.f28492e = cVar.f28498e;
        this.f28493f = cVar.f28499f;
    }

    public static d0 a(Bundle bundle) {
        IconCompat iconCompat;
        Object parcelable;
        Bundle bundle2 = bundle.getBundle("icon");
        c cVar = new c();
        cVar.f28494a = bundle.getCharSequence("name");
        if (bundle2 != null) {
            PorterDuff.Mode mode = IconCompat.f1653k;
            int i10 = bundle2.getInt("type");
            iconCompat = new IconCompat(i10);
            iconCompat.f1658e = bundle2.getInt("int1");
            iconCompat.f1659f = bundle2.getInt("int2");
            iconCompat.f1663j = bundle2.getString("string1");
            if (bundle2.containsKey("tint_list")) {
                iconCompat.f1660g = (ColorStateList) bundle2.getParcelable("tint_list");
            }
            if (bundle2.containsKey("tint_mode")) {
                iconCompat.f1661h = PorterDuff.Mode.valueOf(bundle2.getString("tint_mode"));
            }
            switch (i10) {
                case -1:
                case 1:
                case 5:
                    parcelable = bundle2.getParcelable("obj");
                    iconCompat.f1655b = parcelable;
                    break;
                case 0:
                default:
                    Log.w("IconCompat", "Unknown type " + i10);
                    iconCompat = null;
                    break;
                case 2:
                case 4:
                case 6:
                    parcelable = bundle2.getString("obj");
                    iconCompat.f1655b = parcelable;
                    break;
                case 3:
                    iconCompat.f1655b = bundle2.getByteArray("obj");
                    break;
            }
        } else {
            iconCompat = null;
        }
        cVar.f28495b = iconCompat;
        cVar.f28496c = bundle.getString("uri");
        cVar.f28497d = bundle.getString(Action.KEY_ATTRIBUTE);
        cVar.f28498e = bundle.getBoolean("isBot");
        cVar.f28499f = bundle.getBoolean("isImportant");
        return new d0(cVar);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0063  */
    /* JADX WARN: Code duplicated, block: B:18:0x006e  */
    public Bundle b() {
        Bundle bundle;
        Parcelable parcelable;
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.f28488a);
        IconCompat iconCompat = this.f28489b;
        if (iconCompat != null) {
            Objects.requireNonNull(iconCompat);
            bundle = new Bundle();
            switch (iconCompat.f1654a) {
                case -1:
                    parcelable = (Parcelable) iconCompat.f1655b;
                    bundle.putParcelable("obj", parcelable);
                    bundle.putInt("type", iconCompat.f1654a);
                    bundle.putInt("int1", iconCompat.f1658e);
                    bundle.putInt("int2", iconCompat.f1659f);
                    bundle.putString("string1", iconCompat.f1663j);
                    colorStateList = iconCompat.f1660g;
                    if (colorStateList != null) {
                        bundle.putParcelable("tint_list", colorStateList);
                    }
                    mode = iconCompat.f1661h;
                    if (mode != IconCompat.f1653k) {
                        bundle.putString("tint_mode", mode.name());
                    }
                    break;
                case 0:
                default:
                    throw new IllegalArgumentException("Invalid icon");
                case 1:
                case 5:
                    parcelable = (Bitmap) iconCompat.f1655b;
                    bundle.putParcelable("obj", parcelable);
                    bundle.putInt("type", iconCompat.f1654a);
                    bundle.putInt("int1", iconCompat.f1658e);
                    bundle.putInt("int2", iconCompat.f1659f);
                    bundle.putString("string1", iconCompat.f1663j);
                    colorStateList = iconCompat.f1660g;
                    if (colorStateList != null) {
                        bundle.putParcelable("tint_list", colorStateList);
                    }
                    mode = iconCompat.f1661h;
                    if (mode != IconCompat.f1653k) {
                        bundle.putString("tint_mode", mode.name());
                    }
                    break;
                case 2:
                case 4:
                case 6:
                    bundle.putString("obj", (String) iconCompat.f1655b);
                    bundle.putInt("type", iconCompat.f1654a);
                    bundle.putInt("int1", iconCompat.f1658e);
                    bundle.putInt("int2", iconCompat.f1659f);
                    bundle.putString("string1", iconCompat.f1663j);
                    colorStateList = iconCompat.f1660g;
                    if (colorStateList != null) {
                        bundle.putParcelable("tint_list", colorStateList);
                    }
                    mode = iconCompat.f1661h;
                    if (mode != IconCompat.f1653k) {
                        bundle.putString("tint_mode", mode.name());
                    }
                    break;
                case 3:
                    bundle.putByteArray("obj", (byte[]) iconCompat.f1655b);
                    bundle.putInt("type", iconCompat.f1654a);
                    bundle.putInt("int1", iconCompat.f1658e);
                    bundle.putInt("int2", iconCompat.f1659f);
                    bundle.putString("string1", iconCompat.f1663j);
                    colorStateList = iconCompat.f1660g;
                    if (colorStateList != null) {
                        bundle.putParcelable("tint_list", colorStateList);
                    }
                    mode = iconCompat.f1661h;
                    if (mode != IconCompat.f1653k) {
                        bundle.putString("tint_mode", mode.name());
                    }
                    break;
            }
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.f28490c);
        bundle2.putString(Action.KEY_ATTRIBUTE, this.f28491d);
        bundle2.putBoolean("isBot", this.f28492e);
        bundle2.putBoolean("isImportant", this.f28493f);
        return bundle2;
    }
}
