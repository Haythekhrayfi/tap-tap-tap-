package d0;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class y implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f28621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Notification.Builder f28622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f28623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<Bundle> f28624d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f28625e = new Bundle();

    public y(t tVar) {
        this.f28623c = tVar;
        this.f28621a = tVar.f28579a;
        Notification.Builder builder = Build.VERSION.SDK_INT >= 26 ? new Notification.Builder(tVar.f28579a, tVar.G) : new Notification.Builder(tVar.f28579a);
        this.f28622b = builder;
        Notification notification = tVar.N;
        Notification.BubbleMetadata bubbleMetadataB = null;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(tVar.f28583e).setContentText(tVar.f28584f).setContentInfo(tVar.f28588j).setContentIntent(tVar.f28585g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(tVar.f28586h, (notification.flags & 128) != 0).setLargeIcon(tVar.f28587i).setNumber(tVar.f28589k).setProgress(tVar.f28597s, tVar.f28598t, tVar.f28599u);
        builder.setSubText(tVar.f28595q).setUsesChronometer(tVar.f28592n).setPriority(tVar.f28590l);
        for (p pVar : tVar.f28580b) {
            IconCompat iconCompatA = pVar.a();
            Notification.Action.Builder builder2 = new Notification.Action.Builder(iconCompatA != null ? iconCompatA.l() : null, pVar.f28547j, pVar.f28548k);
            f0[] f0VarArr = pVar.f28540c;
            if (f0VarArr != null) {
                int length = f0VarArr.length;
                RemoteInput[] remoteInputArr = new RemoteInput[length];
                for (int i10 = 0; i10 < f0VarArr.length; i10++) {
                    remoteInputArr[i10] = f0.a(f0VarArr[i10]);
                }
                for (int i11 = 0; i11 < length; i11++) {
                    builder2.addRemoteInput(remoteInputArr[i11]);
                }
            }
            Bundle bundle = pVar.f28538a != null ? new Bundle(pVar.f28538a) : new Bundle();
            bundle.putBoolean("android.support.allowGeneratedReplies", pVar.f28542e);
            int i12 = Build.VERSION.SDK_INT;
            builder2.setAllowGeneratedReplies(pVar.f28542e);
            bundle.putInt("android.support.action.semanticAction", pVar.f28544g);
            if (i12 >= 28) {
                builder2.setSemanticAction(pVar.f28544g);
            }
            if (i12 >= 29) {
                builder2.setContextual(pVar.f28545h);
            }
            if (i12 >= 31) {
                builder2.setAuthenticationRequired(pVar.f28549l);
            }
            bundle.putBoolean("android.support.action.showsUserInterface", pVar.f28543f);
            builder2.addExtras(bundle);
            this.f28622b.addAction(builder2.build());
        }
        Bundle bundle2 = tVar.C;
        if (bundle2 != null) {
            this.f28625e.putAll(bundle2);
        }
        int i13 = Build.VERSION.SDK_INT;
        this.f28622b.setShowWhen(tVar.f28591m);
        this.f28622b.setLocalOnly(tVar.f28603y).setGroup(tVar.f28600v).setGroupSummary(tVar.f28601w).setSortKey(tVar.f28602x);
        this.f28622b.setCategory(tVar.B).setColor(tVar.D).setVisibility(tVar.E).setPublicVersion(tVar.F).setSound(notification.sound, notification.audioAttributes);
        List listA = i13 < 28 ? a(b(tVar.f28581c), tVar.P) : tVar.P;
        if (listA != null && !listA.isEmpty()) {
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                this.f28622b.addPerson((String) it.next());
            }
        }
        if (tVar.f28582d.size() > 0) {
            Bundle bundle3 = tVar.b().getBundle("android.car.EXTENSIONS");
            bundle3 = bundle3 == null ? new Bundle() : bundle3;
            Bundle bundle4 = new Bundle(bundle3);
            Bundle bundle5 = new Bundle();
            for (int i14 = 0; i14 < tVar.f28582d.size(); i14++) {
                String string = Integer.toString(i14);
                p pVar2 = tVar.f28582d.get(i14);
                Object obj = z.f28626a;
                Bundle bundle6 = new Bundle();
                IconCompat iconCompatA2 = pVar2.a();
                bundle6.putInt("icon", iconCompatA2 != null ? iconCompatA2.f() : 0);
                bundle6.putCharSequence("title", pVar2.f28547j);
                bundle6.putParcelable("actionIntent", pVar2.f28548k);
                Bundle bundle7 = pVar2.f28538a != null ? new Bundle(pVar2.f28538a) : new Bundle();
                bundle7.putBoolean("android.support.allowGeneratedReplies", pVar2.f28542e);
                bundle6.putBundle("extras", bundle7);
                bundle6.putParcelableArray("remoteInputs", z.c(pVar2.f28540c));
                bundle6.putBoolean("showsUserInterface", pVar2.f28543f);
                bundle6.putInt("semanticAction", pVar2.f28544g);
                bundle5.putBundle(string, bundle6);
            }
            bundle3.putBundle("invisible_actions", bundle5);
            bundle4.putBundle("invisible_actions", bundle5);
            tVar.b().putBundle("android.car.EXTENSIONS", bundle3);
            this.f28625e.putBundle("android.car.EXTENSIONS", bundle4);
        }
        int i15 = Build.VERSION.SDK_INT;
        Icon icon = tVar.O;
        if (icon != null) {
            this.f28622b.setSmallIcon(icon);
        }
        this.f28622b.setExtras(tVar.C).setRemoteInputHistory(null);
        if (i15 >= 26) {
            this.f28622b.setBadgeIconType(tVar.H).setSettingsText(tVar.f28596r).setShortcutId(tVar.I).setTimeoutAfter(tVar.K).setGroupAlertBehavior(0);
            if (tVar.A) {
                this.f28622b.setColorized(tVar.f28604z);
            }
            if (!TextUtils.isEmpty(tVar.G)) {
                this.f28622b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i15 >= 28) {
            for (d0 d0Var : tVar.f28581c) {
                Notification.Builder builder3 = this.f28622b;
                Objects.requireNonNull(d0Var);
                builder3.addPerson(d0.b.b(d0Var));
            }
        }
        int i16 = Build.VERSION.SDK_INT;
        if (i16 >= 29) {
            this.f28622b.setAllowSystemGeneratedContextualActions(tVar.L);
            Notification.Builder builder4 = this.f28622b;
            s sVar = tVar.M;
            if (sVar != null) {
                if (i16 >= 30) {
                    bubbleMetadataB = s.b.b(sVar);
                } else if (i16 == 29) {
                    bubbleMetadataB = s.a.b(sVar);
                }
            }
            builder4.setBubbleMetadata(bubbleMetadataB);
            e0.b bVar = tVar.J;
            if (bVar != null) {
                this.f28622b.setLocusId(bVar.f28967b);
            }
        }
    }

    public static List<String> a(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        q.c cVar = new q.c(list2.size() + list.size());
        cVar.addAll(list);
        cVar.addAll(list2);
        return new ArrayList(cVar);
    }

    public static List<String> b(List<d0> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (d0 d0Var : list) {
            String string = d0Var.f28490c;
            if (string == null) {
                if (d0Var.f28488a != null) {
                    StringBuilder sbA = defpackage.a.a("name:");
                    sbA.append((Object) d0Var.f28488a);
                    string = sbA.toString();
                } else {
                    string = "";
                }
            }
            arrayList.add(string);
        }
        return arrayList;
    }
}
