package f0;

import android.app.ActivityManager;
import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.os.UserHandle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import d0.d0;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class b {
    public int A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f29165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f29166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f29167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Intent[] f29168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ComponentName f29169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f29170f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CharSequence f29171g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f29172h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public IconCompat f29173i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f29174j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d0[] f29175k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Set<String> f29176l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public e0.b f29177m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f29178n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f29179o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public PersistableBundle f29180p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f29181q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public UserHandle f29182r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f29183s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f29184t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f29185u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f29186v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f29187w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f29188x = true;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f29189y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f29190z;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f29191a;

        public a(Context context, ShortcutInfo shortcutInfo) {
            d0[] d0VarArr;
            String string;
            b bVar = new b();
            this.f29191a = bVar;
            bVar.f29165a = context;
            bVar.f29166b = shortcutInfo.getId();
            bVar.f29167c = shortcutInfo.getPackage();
            Intent[] intents = shortcutInfo.getIntents();
            bVar.f29168d = (Intent[]) Arrays.copyOf(intents, intents.length);
            bVar.f29169e = shortcutInfo.getActivity();
            bVar.f29170f = shortcutInfo.getShortLabel();
            bVar.f29171g = shortcutInfo.getLongLabel();
            bVar.f29172h = shortcutInfo.getDisabledMessage();
            int i10 = 0;
            bVar.f29190z = Build.VERSION.SDK_INT >= 28 ? shortcutInfo.getDisabledReason() : shortcutInfo.isEnabled() ? 0 : 3;
            bVar.f29176l = shortcutInfo.getCategories();
            PersistableBundle extras = shortcutInfo.getExtras();
            e0.b bVar2 = null;
            if (extras == null || !extras.containsKey("extraPersonCount")) {
                d0VarArr = null;
            } else {
                int i11 = extras.getInt("extraPersonCount");
                d0VarArr = new d0[i11];
                while (i10 < i11) {
                    StringBuilder sbA = defpackage.a.a("extraPerson_");
                    int i12 = i10 + 1;
                    sbA.append(i12);
                    d0VarArr[i10] = d0.a.a(extras.getPersistableBundle(sbA.toString()));
                    i10 = i12;
                }
            }
            bVar.f29175k = d0VarArr;
            this.f29191a.f29182r = shortcutInfo.getUserHandle();
            this.f29191a.f29181q = shortcutInfo.getLastChangedTimestamp();
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 30) {
                this.f29191a.f29183s = shortcutInfo.isCached();
            }
            this.f29191a.f29184t = shortcutInfo.isDynamic();
            this.f29191a.f29185u = shortcutInfo.isPinned();
            this.f29191a.f29186v = shortcutInfo.isDeclaredInManifest();
            this.f29191a.f29187w = shortcutInfo.isImmutable();
            this.f29191a.f29188x = shortcutInfo.isEnabled();
            this.f29191a.f29189y = shortcutInfo.hasKeyFieldsOnly();
            b bVar3 = this.f29191a;
            if (i13 < 29) {
                PersistableBundle extras2 = shortcutInfo.getExtras();
                if (extras2 != null && (string = extras2.getString("extraLocusId")) != null) {
                    bVar2 = new e0.b(string);
                }
            } else if (shortcutInfo.getLocusId() != null) {
                bVar2 = e0.b.a(shortcutInfo.getLocusId());
            }
            bVar3.f29177m = bVar2;
            this.f29191a.f29179o = shortcutInfo.getRank();
            this.f29191a.f29180p = shortcutInfo.getExtras();
        }

        public a(Context context, String str) {
            b bVar = new b();
            this.f29191a = bVar;
            bVar.f29165a = context;
            bVar.f29166b = str;
        }

        public a(b bVar) {
            b bVar2 = new b();
            this.f29191a = bVar2;
            bVar2.f29165a = bVar.f29165a;
            bVar2.f29166b = bVar.f29166b;
            bVar2.f29167c = bVar.f29167c;
            Intent[] intentArr = bVar.f29168d;
            bVar2.f29168d = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
            bVar2.f29169e = bVar.f29169e;
            bVar2.f29170f = bVar.f29170f;
            bVar2.f29171g = bVar.f29171g;
            bVar2.f29172h = bVar.f29172h;
            bVar2.f29190z = bVar.f29190z;
            bVar2.f29173i = bVar.f29173i;
            bVar2.f29174j = bVar.f29174j;
            bVar2.f29182r = bVar.f29182r;
            bVar2.f29181q = bVar.f29181q;
            bVar2.f29183s = bVar.f29183s;
            bVar2.f29184t = bVar.f29184t;
            bVar2.f29185u = bVar.f29185u;
            bVar2.f29186v = bVar.f29186v;
            bVar2.f29187w = bVar.f29187w;
            bVar2.f29188x = bVar.f29188x;
            bVar2.f29177m = bVar.f29177m;
            bVar2.f29178n = bVar.f29178n;
            bVar2.f29189y = bVar.f29189y;
            bVar2.f29179o = bVar.f29179o;
            d0[] d0VarArr = bVar.f29175k;
            if (d0VarArr != null) {
                bVar2.f29175k = (d0[]) Arrays.copyOf(d0VarArr, d0VarArr.length);
            }
            if (bVar.f29176l != null) {
                bVar2.f29176l = new HashSet(bVar.f29176l);
            }
            PersistableBundle persistableBundle = bVar.f29180p;
            if (persistableBundle != null) {
                bVar2.f29180p = persistableBundle;
            }
            bVar2.A = bVar.A;
        }
    }

    public Intent a(Intent intent) {
        Bitmap bitmapCopy;
        Bitmap bitmapCreateBitmap;
        Parcelable[] parcelableArr = this.f29168d;
        intent.putExtra("android.intent.extra.shortcut.INTENT", parcelableArr[parcelableArr.length - 1]).putExtra("android.intent.extra.shortcut.NAME", this.f29170f.toString());
        if (this.f29173i != null) {
            Drawable activityIcon = null;
            if (this.f29174j) {
                PackageManager packageManager = this.f29165a.getPackageManager();
                ComponentName componentName = this.f29169e;
                if (componentName != null) {
                    try {
                        activityIcon = packageManager.getActivityIcon(componentName);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                if (activityIcon == null) {
                    activityIcon = this.f29165a.getApplicationInfo().loadIcon(packageManager);
                }
            }
            IconCompat iconCompat = this.f29173i;
            Context context = this.f29165a;
            iconCompat.a(context);
            int i10 = iconCompat.f1654a;
            if (i10 == 1) {
                bitmapCopy = (Bitmap) iconCompat.f1655b;
                if (activityIcon != null) {
                    bitmapCopy = bitmapCopy.copy(bitmapCopy.getConfig(), true);
                }
            } else if (i10 == 2) {
                try {
                    Context contextCreatePackageContext = context.createPackageContext(iconCompat.g(), 0);
                    if (activityIcon == null) {
                        intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(contextCreatePackageContext, iconCompat.f1658e));
                    } else {
                        int i11 = iconCompat.f1658e;
                        Object obj = e0.a.f28964a;
                        Drawable drawableB = e0.a.c.b(contextCreatePackageContext, i11);
                        if (drawableB.getIntrinsicWidth() <= 0 || drawableB.getIntrinsicHeight() <= 0) {
                            int launcherLargeIconSize = ((ActivityManager) contextCreatePackageContext.getSystemService("activity")).getLauncherLargeIconSize();
                            bitmapCreateBitmap = Bitmap.createBitmap(launcherLargeIconSize, launcherLargeIconSize, Bitmap.Config.ARGB_8888);
                        } else {
                            bitmapCreateBitmap = Bitmap.createBitmap(drawableB.getIntrinsicWidth(), drawableB.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                        }
                        drawableB.setBounds(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                        drawableB.draw(new Canvas(bitmapCreateBitmap));
                        bitmapCopy = bitmapCreateBitmap;
                    }
                } catch (PackageManager.NameNotFoundException e10) {
                    StringBuilder sbA = defpackage.a.a("Can't find package ");
                    sbA.append(iconCompat.f1655b);
                    throw new IllegalArgumentException(sbA.toString(), e10);
                }
            } else {
                if (i10 != 5) {
                    throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
                }
                bitmapCopy = IconCompat.c((Bitmap) iconCompat.f1655b, true);
            }
            if (activityIcon != null) {
                int width = bitmapCopy.getWidth();
                int height = bitmapCopy.getHeight();
                activityIcon.setBounds(width / 2, height / 2, width, height);
                activityIcon.draw(new Canvas(bitmapCopy));
            }
            intent.putExtra("android.intent.extra.shortcut.ICON", bitmapCopy);
        }
        return intent;
    }

    public ShortcutInfo b() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f29165a, this.f29166b).setShortLabel(this.f29170f).setIntents(this.f29168d);
        IconCompat iconCompat = this.f29173i;
        if (iconCompat != null) {
            intents.setIcon(IconCompat.a.f(iconCompat, this.f29165a));
        }
        if (!TextUtils.isEmpty(this.f29171g)) {
            intents.setLongLabel(this.f29171g);
        }
        if (!TextUtils.isEmpty(this.f29172h)) {
            intents.setDisabledMessage(this.f29172h);
        }
        ComponentName componentName = this.f29169e;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f29176l;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f29179o);
        PersistableBundle persistableBundle = this.f29180p;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        int i10 = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            d0[] d0VarArr = this.f29175k;
            if (d0VarArr != null && d0VarArr.length > 0) {
                int length = d0VarArr.length;
                Person[] personArr = new Person[length];
                while (i10 < length) {
                    d0 d0Var = this.f29175k[i10];
                    Objects.requireNonNull(d0Var);
                    personArr[i10] = d0.b.b(d0Var);
                    i10++;
                }
                intents.setPersons(personArr);
            }
            e0.b bVar = this.f29177m;
            if (bVar != null) {
                intents.setLocusId(bVar.f28967b);
            }
            intents.setLongLived(this.f29178n);
        } else {
            if (this.f29180p == null) {
                this.f29180p = new PersistableBundle();
            }
            d0[] d0VarArr2 = this.f29175k;
            if (d0VarArr2 != null && d0VarArr2.length > 0) {
                this.f29180p.putInt("extraPersonCount", d0VarArr2.length);
                while (i10 < this.f29175k.length) {
                    PersistableBundle persistableBundle2 = this.f29180p;
                    StringBuilder sbA = defpackage.a.a("extraPerson_");
                    int i11 = i10 + 1;
                    sbA.append(i11);
                    String string = sbA.toString();
                    d0 d0Var2 = this.f29175k[i10];
                    Objects.requireNonNull(d0Var2);
                    persistableBundle2.putPersistableBundle(string, d0.a.b(d0Var2));
                    i10 = i11;
                }
            }
            e0.b bVar2 = this.f29177m;
            if (bVar2 != null) {
                this.f29180p.putString("extraLocusId", bVar2.f28966a);
            }
            this.f29180p.putBoolean("extraLongLived", this.f29178n);
            intents.setExtras(this.f29180p);
        }
        return intents.build();
    }
}
