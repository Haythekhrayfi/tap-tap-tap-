package d0;

import android.app.Notification;
import android.app.Person;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class w extends x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<a> f28606e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<a> f28607f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d0 f28608g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f28609h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Boolean f28610i;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CharSequence f28611a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f28612b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d0 f28613c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Bundle f28614d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f28615e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Uri f28616f;

        public a(CharSequence charSequence, long j10, d0 d0Var) {
            this.f28614d = new Bundle();
            this.f28611a = charSequence;
            this.f28612b = j10;
            this.f28613c = d0Var;
        }

        @Deprecated
        public a(CharSequence charSequence, long j10, CharSequence charSequence2) {
            d0.c cVar = new d0.c();
            cVar.f28494a = charSequence2;
            this(charSequence, j10, new d0(cVar));
        }

        public static Bundle[] a(List<a> list) {
            Bundle[] bundleArr = new Bundle[list.size()];
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                a aVar = list.get(i10);
                Objects.requireNonNull(aVar);
                Bundle bundle = new Bundle();
                CharSequence charSequence = aVar.f28611a;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", aVar.f28612b);
                d0 d0Var = aVar.f28613c;
                if (d0Var != null) {
                    bundle.putCharSequence("sender", d0Var.f28488a);
                    if (Build.VERSION.SDK_INT >= 28) {
                        d0 d0Var2 = aVar.f28613c;
                        Objects.requireNonNull(d0Var2);
                        bundle.putParcelable("sender_person", d0.b.b(d0Var2));
                    } else {
                        bundle.putBundle("person", aVar.f28613c.b());
                    }
                }
                String str = aVar.f28615e;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = aVar.f28616f;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = aVar.f28614d;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                bundleArr[i10] = bundle;
            }
            return bundleArr;
        }

        public static List<a> b(Parcelable[] parcelableArr) {
            d0 d0Var;
            ArrayList arrayList = new ArrayList(parcelableArr.length);
            for (int i10 = 0; i10 < parcelableArr.length; i10++) {
                if (parcelableArr[i10] instanceof Bundle) {
                    Bundle bundle = (Bundle) parcelableArr[i10];
                    a aVar = null;
                    try {
                        if (bundle.containsKey("text") && bundle.containsKey("time")) {
                            if (bundle.containsKey("person")) {
                                d0Var = d0.a(bundle.getBundle("person"));
                            } else if (bundle.containsKey("sender_person") && Build.VERSION.SDK_INT >= 28) {
                                d0Var = d0.b.a((Person) bundle.getParcelable("sender_person"));
                            } else if (bundle.containsKey("sender")) {
                                d0.c cVar = new d0.c();
                                cVar.f28494a = bundle.getCharSequence("sender");
                                d0Var = new d0(cVar);
                            } else {
                                d0Var = null;
                            }
                            a aVar2 = new a(bundle.getCharSequence("text"), bundle.getLong("time"), d0Var);
                            if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                                String string = bundle.getString("type");
                                Uri uri = (Uri) bundle.getParcelable("uri");
                                aVar2.f28615e = string;
                                aVar2.f28616f = uri;
                            }
                            if (bundle.containsKey("extras")) {
                                aVar2.f28614d.putAll(bundle.getBundle("extras"));
                            }
                            aVar = aVar2;
                        }
                    } catch (ClassCastException unused) {
                    }
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                }
            }
            return arrayList;
        }

        public Notification.MessagingStyle.Message c() {
            Notification.MessagingStyle.Message message;
            d0 d0Var = this.f28613c;
            if (Build.VERSION.SDK_INT >= 28) {
                message = new Notification.MessagingStyle.Message(this.f28611a, this.f28612b, d0Var != null ? d0.b.b(d0Var) : null);
            } else {
                message = new Notification.MessagingStyle.Message(this.f28611a, this.f28612b, d0Var != null ? d0Var.f28488a : null);
            }
            String str = this.f28615e;
            if (str != null) {
                message.setData(str, this.f28616f);
            }
            return message;
        }
    }

    public w() {
    }

    public w(d0 d0Var) {
        if (TextUtils.isEmpty(d0Var.f28488a)) {
            throw new IllegalArgumentException("User's name must not be empty.");
        }
        this.f28608g = d0Var;
    }

    @Override // d0.x
    public void a(Bundle bundle) {
        super.a(bundle);
        bundle.putCharSequence("android.selfDisplayName", this.f28608g.f28488a);
        bundle.putBundle("android.messagingStyleUser", this.f28608g.b());
        bundle.putCharSequence("android.hiddenConversationTitle", this.f28609h);
        if (this.f28609h != null && this.f28610i.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", this.f28609h);
        }
        if (!this.f28606e.isEmpty()) {
            bundle.putParcelableArray("android.messages", a.a(this.f28606e));
        }
        if (!this.f28607f.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", a.a(this.f28607f));
        }
        Boolean bool = this.f28610i;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0023  */
    @Override // d0.x
    public void b(n nVar) {
        boolean zBooleanValue;
        Notification.MessagingStyle messagingStyle;
        t tVar = this.f28617a;
        if (tVar == null || tVar.f28579a.getApplicationInfo().targetSdkVersion >= 28 || this.f28610i != null) {
            Boolean bool = this.f28610i;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
        } else if (this.f28609h != null) {
            zBooleanValue = true;
        } else {
            zBooleanValue = false;
        }
        this.f28610i = Boolean.valueOf(zBooleanValue);
        if (Build.VERSION.SDK_INT >= 28) {
            d0 d0Var = this.f28608g;
            Objects.requireNonNull(d0Var);
            messagingStyle = new Notification.MessagingStyle(d0.b.b(d0Var));
        } else {
            messagingStyle = new Notification.MessagingStyle(this.f28608g.f28488a);
        }
        Iterator<a> it = this.f28606e.iterator();
        while (it.hasNext()) {
            messagingStyle.addMessage(it.next().c());
        }
        if (Build.VERSION.SDK_INT >= 26) {
            Iterator<a> it2 = this.f28607f.iterator();
            while (it2.hasNext()) {
                messagingStyle.addHistoricMessage(it2.next().c());
            }
        }
        if (this.f28610i.booleanValue() || Build.VERSION.SDK_INT >= 28) {
            messagingStyle.setConversationTitle(this.f28609h);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            messagingStyle.setGroupConversation(this.f28610i.booleanValue());
        }
        messagingStyle.setBuilder(((y) nVar).f28622b);
    }

    @Override // d0.x
    public void c(Bundle bundle) {
        super.c(bundle);
        bundle.remove("android.messagingStyleUser");
        bundle.remove("android.selfDisplayName");
        bundle.remove("android.conversationTitle");
        bundle.remove("android.hiddenConversationTitle");
        bundle.remove("android.messages");
        bundle.remove("android.messages.historic");
        bundle.remove("android.isGroupConversation");
    }

    @Override // d0.x
    public String d() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    @Override // d0.x
    public void h(Bundle bundle) {
        super.h(bundle);
        this.f28606e.clear();
        if (bundle.containsKey("android.messagingStyleUser")) {
            this.f28608g = d0.a(bundle.getBundle("android.messagingStyleUser"));
        } else {
            d0.c cVar = new d0.c();
            cVar.f28494a = bundle.getString("android.selfDisplayName");
            this.f28608g = new d0(cVar);
        }
        CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
        this.f28609h = charSequence;
        if (charSequence == null) {
            this.f28609h = bundle.getCharSequence("android.hiddenConversationTitle");
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
        if (parcelableArray != null) {
            this.f28606e.addAll(a.b(parcelableArray));
        }
        Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
        if (parcelableArray2 != null) {
            this.f28607f.addAll(a.b(parcelableArray2));
        }
        if (bundle.containsKey("android.isGroupConversation")) {
            this.f28610i = Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
        }
    }

    @Deprecated
    public w(CharSequence charSequence) {
        d0.c cVar = new d0.c();
        cVar.f28494a = charSequence;
        this.f28608g = new d0(cVar);
    }
}
