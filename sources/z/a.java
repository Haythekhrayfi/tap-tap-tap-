package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.developer.filepicker.model.DialogConfigs;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f44916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f44917b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f44918c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SparseArray<C0481a> f44919d = new SparseArray<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SparseArray<androidx.constraintlayout.widget.c> f44920e = new SparseArray<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public z.b f44921f = null;

    /* JADX INFO: renamed from: z.a$a, reason: collision with other inner class name */
    public static class C0481a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f44922a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList<b> f44923b = new ArrayList<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f44924c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public androidx.constraintlayout.widget.c f44925d;

        public C0481a(Context context, XmlPullParser xmlPullParser) {
            this.f44924c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), d.f44953t);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    this.f44922a = typedArrayObtainStyledAttributes.getResourceId(index, this.f44922a);
                } else if (index == 1) {
                    this.f44924c = typedArrayObtainStyledAttributes.getResourceId(index, this.f44924c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f44924c);
                    context.getResources().getResourceName(this.f44924c);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                        this.f44925d = cVar;
                        cVar.e((ConstraintLayout) LayoutInflater.from(context).inflate(this.f44924c, (ViewGroup) null));
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public int a(float f10, float f11) {
            for (int i10 = 0; i10 < this.f44923b.size(); i10++) {
                if (this.f44923b.get(i10).a(f10, f11)) {
                    return i10;
                }
            }
            return -1;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f44926a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f44927b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f44928c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f44929d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f44930e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public androidx.constraintlayout.widget.c f44931f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f44926a = Float.NaN;
            this.f44927b = Float.NaN;
            this.f44928c = Float.NaN;
            this.f44929d = Float.NaN;
            this.f44930e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), d.f44957x);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    this.f44930e = typedArrayObtainStyledAttributes.getResourceId(index, this.f44930e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f44930e);
                    context.getResources().getResourceName(this.f44930e);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                        this.f44931f = cVar;
                        cVar.e((ConstraintLayout) LayoutInflater.from(context).inflate(this.f44930e, (ViewGroup) null));
                    }
                } else if (index == 1) {
                    this.f44929d = typedArrayObtainStyledAttributes.getDimension(index, this.f44929d);
                } else if (index == 2) {
                    this.f44927b = typedArrayObtainStyledAttributes.getDimension(index, this.f44927b);
                } else if (index == 3) {
                    this.f44928c = typedArrayObtainStyledAttributes.getDimension(index, this.f44928c);
                } else if (index == 4) {
                    this.f44926a = typedArrayObtainStyledAttributes.getDimension(index, this.f44926a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public boolean a(float f10, float f11) {
            if (!Float.isNaN(this.f44926a) && f10 < this.f44926a) {
                return false;
            }
            if (!Float.isNaN(this.f44927b) && f11 < this.f44927b) {
                return false;
            }
            if (Float.isNaN(this.f44928c) || f10 <= this.f44928c) {
                return Float.isNaN(this.f44929d) || f11 <= this.f44929d;
            }
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0070  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public a(Context context, ConstraintLayout constraintLayout, int i10) {
        C0481a c0481a = null;
        this.f44916a = constraintLayout;
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            int eventType = xml.getEventType();
            while (true) {
                byte b10 = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (!name.equals("ConstraintSet")) {
                                b10 = -1;
                            } else {
                                b10 = 4;
                            }
                            break;
                        case 80204913:
                            if (!name.equals("State")) {
                                b10 = -1;
                            } else {
                                b10 = 2;
                            }
                            break;
                        case 1382829617:
                            if (!name.equals("StateSet")) {
                                b10 = -1;
                            }
                            break;
                        case 1657696882:
                            if (!name.equals("layoutDescription")) {
                                b10 = -1;
                            } else {
                                b10 = 0;
                            }
                            break;
                        case 1901439077:
                            if (!name.equals("Variant")) {
                                b10 = -1;
                            } else {
                                b10 = 3;
                            }
                            break;
                        default:
                            b10 = -1;
                            break;
                    }
                    if (b10 == 2) {
                        C0481a c0481a2 = new C0481a(context, xml);
                        this.f44919d.put(c0481a2.f44922a, c0481a2);
                        c0481a = c0481a2;
                    } else if (b10 == 3) {
                        b bVar = new b(context, xml);
                        if (c0481a != null) {
                            c0481a.f44923b.add(bVar);
                        }
                    } else if (b10 == 4) {
                        a(context, xml);
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    public final void a(Context context, XmlPullParser xmlPullParser) {
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            if (attributeName != null && attributeValue != null && FacebookMediationAdapter.KEY_ID.equals(attributeName)) {
                int identifier = attributeValue.contains(DialogConfigs.DIRECTORY_SEPERATOR) ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), FacebookMediationAdapter.KEY_ID, context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                cVar.k(context, xmlPullParser);
                this.f44920e.put(identifier, cVar);
                return;
            }
        }
    }

    public void b(int i10, float f10, float f11) {
        z.b bVar;
        int iA;
        int i11 = this.f44917b;
        if (i11 == i10) {
            C0481a c0481aValueAt = i10 == -1 ? this.f44919d.valueAt(0) : this.f44919d.get(i11);
            int i12 = this.f44918c;
            if ((i12 != -1 && c0481aValueAt.f44923b.get(i12).a(f10, f11)) || this.f44918c == (iA = c0481aValueAt.a(f10, f11))) {
                return;
            }
            androidx.constraintlayout.widget.c cVar = iA == -1 ? null : c0481aValueAt.f44923b.get(iA).f44931f;
            if (iA != -1) {
                int i13 = c0481aValueAt.f44923b.get(iA).f44930e;
            }
            if (cVar == null) {
                return;
            }
            this.f44918c = iA;
            z.b bVar2 = this.f44921f;
            if (bVar2 != null) {
                Objects.requireNonNull(bVar2);
            }
            cVar.b(this.f44916a);
            bVar = this.f44921f;
            if (bVar == null) {
                return;
            }
        } else {
            this.f44917b = i10;
            C0481a c0481a = this.f44919d.get(i10);
            int iA2 = c0481a.a(f10, f11);
            androidx.constraintlayout.widget.c cVar2 = iA2 == -1 ? c0481a.f44925d : c0481a.f44923b.get(iA2).f44931f;
            if (iA2 != -1) {
                int i14 = c0481a.f44923b.get(iA2).f44930e;
            }
            if (cVar2 == null) {
                Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i10 + ", dim =" + f10 + ", " + f11);
                return;
            }
            this.f44918c = iA2;
            z.b bVar3 = this.f44921f;
            if (bVar3 != null) {
                Objects.requireNonNull(bVar3);
            }
            cVar2.b(this.f44916a);
            bVar = this.f44921f;
            if (bVar == null) {
                return;
            }
        }
        Objects.requireNonNull(bVar);
    }
}
