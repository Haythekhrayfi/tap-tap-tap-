package d0;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.inscode.autoclicker.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class t {
    public boolean A;
    public String B;
    public Bundle C;
    public int D;
    public int E;
    public Notification F;
    public String G;
    public int H;
    public String I;
    public e0.b J;
    public long K;
    public boolean L;
    public s M;
    public Notification N;
    public Icon O;

    @Deprecated
    public ArrayList<String> P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f28579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList<p> f28580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList<d0> f28581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList<p> f28582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f28583e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f28584f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PendingIntent f28585g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PendingIntent f28586h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Bitmap f28587i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f28588j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f28589k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f28590l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f28591m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f28592n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f28593o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public x f28594p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f28595q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f28596r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f28597s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f28598t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f28599u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f28600v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f28601w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f28602x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f28603y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f28604z;

    @Deprecated
    public t(Context context) {
        this(context, (String) null);
    }

    /* JADX WARN: Code duplicated, block: B:131:0x022e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0088  */
    /* JADX WARN: Code duplicated, block: B:78:0x0132  */
    /* JADX WARN: Code duplicated, block: B:85:0x0146  */
    public t(Context context, Notification notification) {
        x wVar;
        s sVarA;
        Bundle bundle;
        ArrayList parcelableArrayList;
        Bundle bundle2;
        CharSequence[] charSequenceArr;
        Set<String> set;
        Set<String> setB;
        Notification.BubbleMetadata bubbleMetadata;
        LocusId locusId;
        this(context, Build.VERSION.SDK_INT >= 26 ? notification.getChannelId() : null);
        Bundle bundle3 = notification.extras;
        if (bundle3 != null) {
            String string = bundle3.getString("androidx.core.app.extra.COMPAT_TEMPLATE");
            if (string != null) {
                switch (string) {
                    case "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle":
                        wVar = new u();
                        break;
                    case "androidx.core.app.NotificationCompat$BigPictureStyle":
                        wVar = new q();
                        break;
                    case "androidx.core.app.NotificationCompat$InboxStyle":
                        wVar = new v();
                        break;
                    case "androidx.core.app.NotificationCompat$BigTextStyle":
                        wVar = new r();
                        break;
                    case "androidx.core.app.NotificationCompat$MessagingStyle":
                        wVar = new w();
                        break;
                    default:
                        wVar = null;
                        break;
                }
            } else {
                wVar = null;
            }
            if (wVar == null) {
                if (bundle3.containsKey("android.selfDisplayName") || bundle3.containsKey("android.messagingStyleUser")) {
                    wVar = new w();
                } else if (bundle3.containsKey("android.picture") || bundle3.containsKey("android.pictureIcon")) {
                    wVar = new q();
                } else if (bundle3.containsKey("android.bigText")) {
                    wVar = new r();
                } else if (bundle3.containsKey("android.textLines")) {
                    wVar = new v();
                } else {
                    String string2 = bundle3.getString("android.template");
                    if (string2 == null) {
                        wVar = null;
                    } else if (string2.equals(Notification.BigPictureStyle.class.getName())) {
                        wVar = new q();
                    } else if (string2.equals(Notification.BigTextStyle.class.getName())) {
                        wVar = new r();
                    } else if (string2.equals(Notification.InboxStyle.class.getName())) {
                        wVar = new v();
                    } else if (string2.equals(Notification.MessagingStyle.class.getName())) {
                        wVar = new w();
                    } else if (string2.equals(Notification.DecoratedCustomViewStyle.class.getName())) {
                        wVar = new u();
                    } else {
                        wVar = null;
                    }
                }
            }
            if (wVar == null) {
                wVar = null;
            } else {
                try {
                    wVar.h(bundle3);
                } catch (ClassCastException unused) {
                    wVar = null;
                }
            }
        } else {
            wVar = null;
        }
        e(notification.extras.getCharSequence("android.title"));
        d(notification.extras.getCharSequence("android.text"));
        this.f28588j = c(notification.extras.getCharSequence("android.infoText"));
        this.f28595q = c(notification.extras.getCharSequence("android.subText"));
        int i10 = Build.VERSION.SDK_INT;
        this.f28596r = c(i10 >= 26 ? notification.getSettingsText() : null);
        k(wVar);
        this.f28585g = notification.contentIntent;
        this.f28600v = notification.getGroup();
        this.f28601w = (notification.flags & 512) != 0;
        this.J = (i10 < 29 || (locusId = notification.getLocusId()) == null) ? null : e0.b.a(locusId);
        x xVar = wVar;
        this.N.when = notification.when;
        this.f28591m = notification.extras.getBoolean("android.showWhen");
        this.f28592n = notification.extras.getBoolean("android.showChronometer");
        g(16, (notification.flags & 16) != 0);
        g(8, (notification.flags & 8) != 0);
        g(2, (notification.flags & 2) != 0);
        this.f28603y = (notification.flags & 256) != 0;
        h(notification.largeIcon);
        this.H = i10 >= 26 ? notification.getBadgeIconType() : 0;
        this.B = notification.category;
        if (i10 < 29 || (bubbleMetadata = notification.getBubbleMetadata()) == null) {
            sVarA = null;
        } else if (i10 >= 30) {
            sVarA = s.b.a(bubbleMetadata);
        } else if (i10 == 29) {
            sVarA = s.a.a(bubbleMetadata);
        } else {
            sVarA = null;
        }
        this.M = sVarA;
        this.f28589k = notification.number;
        l(notification.tickerText);
        this.f28585g = notification.contentIntent;
        this.N.deleteIntent = notification.deleteIntent;
        PendingIntent pendingIntent = notification.fullScreenIntent;
        boolean z10 = (notification.flags & 128) != 0;
        this.f28586h = pendingIntent;
        g(128, z10);
        Uri uri = notification.sound;
        int i11 = notification.audioStreamType;
        Notification notification2 = this.N;
        notification2.sound = uri;
        notification2.audioStreamType = i11;
        notification2.audioAttributes = new AudioAttributes.Builder().setContentType(4).setLegacyStreamType(i11).build();
        this.N.vibrate = notification.vibrate;
        i(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        f(notification.defaults);
        this.f28590l = notification.priority;
        this.D = notification.color;
        this.E = notification.visibility;
        this.F = notification.publicVersion;
        this.f28602x = notification.getSortKey();
        this.K = i10 >= 26 ? notification.getTimeoutAfter() : 0L;
        this.I = i10 >= 26 ? notification.getShortcutId() : null;
        int i12 = bundle3.getInt("android.progressMax");
        int i13 = bundle3.getInt("android.progress");
        boolean z11 = bundle3.getBoolean("android.progressIndeterminate");
        this.f28597s = i12;
        this.f28598t = i13;
        this.f28599u = z11;
        this.L = i10 >= 29 ? notification.getAllowSystemGeneratedContextualActions() : false;
        int i14 = notification.icon;
        int i15 = notification.iconLevel;
        Notification notification3 = this.N;
        notification3.icon = i14;
        notification3.iconLevel = i15;
        String str = "android.people";
        String str2 = "android.people.list";
        String str3 = "android.colorized";
        String str4 = "android.chronometerCountDown";
        String str5 = "invisible_actions";
        if (notification.extras == null) {
            bundle = null;
        } else {
            bundle = new Bundle(notification.extras);
            bundle.remove("android.title");
            bundle.remove("android.text");
            bundle.remove("android.infoText");
            bundle.remove("android.subText");
            bundle.remove("android.intent.extra.CHANNEL_ID");
            bundle.remove("android.intent.extra.CHANNEL_GROUP_ID");
            bundle.remove("android.showWhen");
            bundle.remove("android.progress");
            bundle.remove("android.progressMax");
            bundle.remove("android.progressIndeterminate");
            bundle.remove("android.chronometerCountDown");
            bundle.remove("android.colorized");
            bundle.remove("android.people.list");
            bundle.remove("android.people");
            bundle.remove("android.support.sortKey");
            bundle.remove("android.support.groupKey");
            bundle.remove("android.support.isGroupSummary");
            bundle.remove("android.support.localOnly");
            bundle.remove("android.support.actionExtras");
            Bundle bundle4 = bundle.getBundle("android.car.EXTENSIONS");
            if (bundle4 != null) {
                Bundle bundle5 = new Bundle(bundle4);
                str5 = "invisible_actions";
                bundle5.remove(str5);
                bundle.putBundle("android.car.EXTENSIONS", bundle5);
            } else {
                str5 = "invisible_actions";
            }
            if (xVar != null) {
                xVar.c(bundle);
            }
        }
        if (bundle != null) {
            Bundle bundle6 = this.C;
            if (bundle6 == null) {
                this.C = new Bundle(bundle);
            } else {
                bundle6.putAll(bundle);
            }
        }
        this.O = notification.getSmallIcon();
        Notification.Action[] actionArr = notification.actions;
        if (actionArr != null && actionArr.length != 0) {
            int length = actionArr.length;
            int i16 = 0;
            while (i16 < length) {
                Notification.Action action = actionArr[i16];
                p.a aVar = action.getIcon() != null ? new p.a(IconCompat.b(action.getIcon()), action.title, action.actionIntent) : new p.a(action.icon, action.title, action.actionIntent);
                RemoteInput[] remoteInputs = action.getRemoteInputs();
                if (remoteInputs != null && remoteInputs.length != 0) {
                    int length2 = remoteInputs.length;
                    int i17 = 0;
                    while (i17 < length2) {
                        RemoteInput remoteInput = remoteInputs[i17];
                        Notification.Action[] actionArr2 = actionArr;
                        RemoteInput[] remoteInputArr = remoteInputs;
                        f0.c cVar = new f0.c(remoteInput.getResultKey());
                        cVar.f28515d = remoteInput.getLabel();
                        cVar.f28516e = remoteInput.getChoices();
                        cVar.f28517f = remoteInput.getAllowFreeFormInput();
                        Bundle extras = remoteInput.getExtras();
                        int i18 = length;
                        if (extras != null) {
                            cVar.f28514c.putAll(extras);
                        }
                        if (Build.VERSION.SDK_INT >= 26 && (setB = f0.a.b(remoteInput)) != null) {
                            for (Iterator<String> it = setB.iterator(); it.hasNext(); it = it) {
                                cVar.f28513b.add(it.next());
                            }
                        }
                        if (Build.VERSION.SDK_INT >= 29) {
                            cVar.f28518g = f0.b.a(remoteInput);
                        }
                        int i19 = length2;
                        String str6 = str3;
                        String str7 = str4;
                        String str8 = str2;
                        String str9 = str;
                        f0 f0Var = new f0(cVar.f28512a, cVar.f28515d, cVar.f28516e, cVar.f28517f, cVar.f28518g, cVar.f28514c, cVar.f28513b);
                        if (aVar.f28555f == null) {
                            aVar.f28555f = new ArrayList<>();
                        }
                        aVar.f28555f.add(f0Var);
                        i17++;
                        length2 = i19;
                        actionArr = actionArr2;
                        remoteInputs = remoteInputArr;
                        length = i18;
                        str3 = str6;
                        str4 = str7;
                        str2 = str8;
                        str = str9;
                    }
                }
                Notification.Action[] actionArr3 = actionArr;
                String str10 = str;
                int i20 = length;
                String str11 = str2;
                String str12 = str3;
                String str13 = str4;
                int i21 = Build.VERSION.SDK_INT;
                aVar.f28553d = action.getAllowGeneratedReplies();
                if (i21 >= 28) {
                    aVar.f28556g = action.getSemanticAction();
                }
                if (i21 >= 29) {
                    aVar.f28558i = action.isContextual();
                }
                if (i21 >= 31) {
                    aVar.f28559j = action.isAuthenticationRequired();
                }
                if (aVar.f28558i) {
                    Objects.requireNonNull(aVar.f28552c, "Contextual Actions must contain a valid PendingIntent");
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<f0> arrayList3 = aVar.f28555f;
                if (arrayList3 != null) {
                    for (f0 f0Var2 : arrayList3) {
                        if ((f0Var2.f28508d || ((charSequenceArr = f0Var2.f28507c) != null && charSequenceArr.length != 0) || (set = f0Var2.f28511g) == null || set.isEmpty()) ? false : true) {
                            arrayList.add(f0Var2);
                        } else {
                            arrayList2.add(f0Var2);
                        }
                    }
                }
                this.f28580b.add(new p(aVar.f28550a, aVar.f28551b, aVar.f28552c, aVar.f28554e, arrayList2.isEmpty() ? null : (f0[]) arrayList2.toArray(new f0[arrayList2.size()]), arrayList.isEmpty() ? null : (f0[]) arrayList.toArray(new f0[arrayList.size()]), aVar.f28553d, aVar.f28556g, aVar.f28557h, aVar.f28558i, aVar.f28559j));
                i16++;
                actionArr = actionArr3;
                length = i20;
                str3 = str12;
                str4 = str13;
                str2 = str11;
                str = str10;
            }
        }
        String str14 = str;
        String str15 = str2;
        String str16 = str3;
        String str17 = str4;
        ArrayList<p> arrayList4 = new ArrayList();
        Bundle bundle7 = notification.extras.getBundle("android.car.EXTENSIONS");
        if (bundle7 != null && (bundle2 = bundle7.getBundle(str5)) != null) {
            for (int i22 = 0; i22 < bundle2.size(); i22++) {
                Bundle bundle8 = bundle2.getBundle(Integer.toString(i22));
                Object obj = z.f28626a;
                Bundle bundle9 = bundle8.getBundle("extras");
                boolean z12 = bundle9 != null ? bundle9.getBoolean("android.support.allowGeneratedReplies", false) : false;
                int i23 = bundle8.getInt("icon");
                arrayList4.add(new p(i23 == 0 ? null : IconCompat.d(null, "", i23), bundle8.getCharSequence("title"), (PendingIntent) bundle8.getParcelable("actionIntent"), bundle8.getBundle("extras"), z.a(z.b(bundle8, "remoteInputs")), z.a(z.b(bundle8, "dataOnlyRemoteInputs")), z12, bundle8.getInt("semanticAction"), bundle8.getBoolean("showsUserInterface"), false, false));
            }
        }
        if (!arrayList4.isEmpty()) {
            for (p pVar : arrayList4) {
                if (pVar != null) {
                    this.f28582d.add(pVar);
                }
            }
        }
        String[] stringArray = notification.extras.getStringArray(str14);
        if (stringArray != null && stringArray.length != 0) {
            for (String str18 : stringArray) {
                if (str18 != null && !str18.isEmpty()) {
                    this.P.add(str18);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 28 && (parcelableArrayList = notification.extras.getParcelableArrayList(str15)) != null && !parcelableArrayList.isEmpty()) {
            Iterator it2 = parcelableArrayList.iterator();
            while (it2.hasNext()) {
                d0 d0VarA = d0.b.a((Person) it2.next());
                if (d0VarA != null) {
                    this.f28581c.add(d0VarA);
                }
            }
        }
        int i24 = Build.VERSION.SDK_INT;
        if (bundle3.containsKey(str17)) {
            boolean z13 = bundle3.getBoolean(str17);
            this.f28593o = z13;
            b().putBoolean(str17, z13);
        }
        if (i24 < 26 || !bundle3.containsKey(str16)) {
            return;
        }
        this.f28604z = bundle3.getBoolean(str16);
        this.A = true;
    }

    public t(Context context, String str) {
        this.f28580b = new ArrayList<>();
        this.f28581c = new ArrayList<>();
        this.f28582d = new ArrayList<>();
        this.f28591m = true;
        this.f28603y = false;
        this.D = 0;
        this.E = 0;
        this.H = 0;
        Notification notification = new Notification();
        this.N = notification;
        this.f28579a = context;
        this.G = str;
        notification.when = System.currentTimeMillis();
        this.N.audioStreamType = -1;
        this.f28590l = 0;
        this.P = new ArrayList<>();
        this.L = true;
    }

    public static CharSequence c(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public Notification a() {
        Bundle bundle;
        RemoteViews remoteViewsG;
        RemoteViews remoteViewsE;
        y yVar = new y(this);
        x xVar = yVar.f28623c.f28594p;
        if (xVar != null) {
            xVar.b(yVar);
        }
        RemoteViews remoteViewsF = xVar != null ? xVar.f(yVar) : null;
        Notification notificationBuild = yVar.f28622b.build();
        if (remoteViewsF != null) {
            notificationBuild.contentView = remoteViewsF;
        } else {
            Objects.requireNonNull(yVar.f28623c);
        }
        if (xVar != null && (remoteViewsE = xVar.e(yVar)) != null) {
            notificationBuild.bigContentView = remoteViewsE;
        }
        if (xVar != null && (remoteViewsG = yVar.f28623c.f28594p.g(yVar)) != null) {
            notificationBuild.headsUpContentView = remoteViewsG;
        }
        if (xVar != null && (bundle = notificationBuild.extras) != null) {
            xVar.a(bundle);
        }
        return notificationBuild;
    }

    public Bundle b() {
        if (this.C == null) {
            this.C = new Bundle();
        }
        return this.C;
    }

    public t d(CharSequence charSequence) {
        this.f28584f = c(charSequence);
        return this;
    }

    public t e(CharSequence charSequence) {
        this.f28583e = c(charSequence);
        return this;
    }

    public t f(int i10) {
        Notification notification = this.N;
        notification.defaults = i10;
        if ((i10 & 4) != 0) {
            notification.flags |= 1;
        }
        return this;
    }

    public final void g(int i10, boolean z10) {
        Notification notification;
        int i11;
        if (z10) {
            notification = this.N;
            i11 = i10 | notification.flags;
        } else {
            notification = this.N;
            i11 = (~i10) & notification.flags;
        }
        notification.flags = i11;
    }

    public t h(Bitmap bitmap) {
        if (bitmap != null && Build.VERSION.SDK_INT < 27) {
            Resources resources = this.f28579a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
            }
        }
        this.f28587i = bitmap;
        return this;
    }

    public t i(int i10, int i11, int i12) {
        Notification notification = this.N;
        notification.ledARGB = i10;
        notification.ledOnMS = i11;
        notification.ledOffMS = i12;
        notification.flags = ((i11 == 0 || i12 == 0) ? 0 : 1) | (notification.flags & (-2));
        return this;
    }

    public t j(Uri uri) {
        Notification notification = this.N;
        notification.sound = uri;
        notification.audioStreamType = -1;
        notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
        return this;
    }

    public t k(x xVar) {
        if (this.f28594p != xVar) {
            this.f28594p = xVar;
            if (xVar != null) {
                xVar.i(this);
            }
        }
        return this;
    }

    public t l(CharSequence charSequence) {
        this.N.tickerText = c(charSequence);
        return this;
    }
}
