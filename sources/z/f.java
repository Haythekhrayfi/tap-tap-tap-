package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f44961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f44962b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f44963c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SparseArray<a> f44964d = new SparseArray<>();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f44965a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList<b> f44966b = new ArrayList<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f44967c;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.f44967c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), d.f44953t);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    this.f44965a = typedArrayObtainStyledAttributes.getResourceId(index, this.f44965a);
                } else if (index == 1) {
                    this.f44967c = typedArrayObtainStyledAttributes.getResourceId(index, this.f44967c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f44967c);
                    context.getResources().getResourceName(this.f44967c);
                    "layout".equals(resourceTypeName);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public int a(float f10, float f11) {
            for (int i10 = 0; i10 < this.f44966b.size(); i10++) {
                if (this.f44966b.get(i10).a(f10, f11)) {
                    return i10;
                }
            }
            return -1;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f44968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f44969b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f44970c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f44971d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f44972e;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f44968a = Float.NaN;
            this.f44969b = Float.NaN;
            this.f44970c = Float.NaN;
            this.f44971d = Float.NaN;
            this.f44972e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), d.f44957x);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    this.f44972e = typedArrayObtainStyledAttributes.getResourceId(index, this.f44972e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f44972e);
                    context.getResources().getResourceName(this.f44972e);
                    "layout".equals(resourceTypeName);
                } else if (index == 1) {
                    this.f44971d = typedArrayObtainStyledAttributes.getDimension(index, this.f44971d);
                } else if (index == 2) {
                    this.f44969b = typedArrayObtainStyledAttributes.getDimension(index, this.f44969b);
                } else if (index == 3) {
                    this.f44970c = typedArrayObtainStyledAttributes.getDimension(index, this.f44970c);
                } else if (index == 4) {
                    this.f44968a = typedArrayObtainStyledAttributes.getDimension(index, this.f44968a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public boolean a(float f10, float f11) {
            if (!Float.isNaN(this.f44968a) && f10 < this.f44968a) {
                return false;
            }
            if (!Float.isNaN(this.f44969b) && f11 < this.f44969b) {
                return false;
            }
            if (Float.isNaN(this.f44970c) || f10 <= this.f44970c) {
                return Float.isNaN(this.f44971d) || f11 <= this.f44971d;
            }
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008d  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public f(Context context, XmlPullParser xmlPullParser) {
        this.f44961a = -1;
        new SparseArray();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), d.f44954u);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                this.f44961a = typedArrayObtainStyledAttributes.getResourceId(index, this.f44961a);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        a aVar = null;
        try {
            int eventType = xmlPullParser.getEventType();
            while (true) {
                byte b10 = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xmlPullParser.getName();
                } else if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                b10 = 2;
                            } else {
                                b10 = -1;
                            }
                            break;
                        case 1301459538:
                            if (name.equals("LayoutDescription")) {
                                b10 = 0;
                            } else {
                                b10 = -1;
                            }
                            break;
                        case 1382829617:
                            if (!name.equals("StateSet")) {
                                b10 = -1;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                b10 = 3;
                            } else {
                                b10 = -1;
                            }
                            break;
                        default:
                            b10 = -1;
                            break;
                    }
                    if (b10 == 2) {
                        aVar = new a(context, xmlPullParser);
                        this.f44964d.put(aVar.f44965a, aVar);
                    } else if (b10 == 3) {
                        b bVar = new b(context, xmlPullParser);
                        if (aVar != null) {
                            aVar.f44966b.add(bVar);
                        }
                    }
                } else if (eventType == 3 && "StateSet".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038 A[PHI: r3
  0x0038: PHI (r3v9 z.f$a) = (r3v2 z.f$a), (r3v14 z.f$a) binds: [B:26:0x0056, B:18:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x003b A[PHI: r3 r4
  0x003b: PHI (r3v3 z.f$a) = (r3v2 z.f$a), (r3v14 z.f$a) binds: [B:26:0x0056, B:18:0x0036] A[DONT_GENERATE, DONT_INLINE]
  0x003b: PHI (r4v3 int) = (r4v2 int), (r4v4 int) binds: [B:26:0x0056, B:18:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    public int a(int i10, int i11, int i12) {
        a aVarValueAt;
        int iA;
        int i13;
        float f10 = i11;
        float f11 = i12;
        if (-1 == i10) {
            aVarValueAt = i10 == -1 ? this.f44964d.valueAt(0) : this.f44964d.get(this.f44962b);
            if (aVarValueAt == null) {
                return -1;
            }
            if ((this.f44963c != -1 && aVarValueAt.f44966b.get(-1).a(f10, f11)) || -1 == (iA = aVarValueAt.a(f10, f11))) {
                return -1;
            }
            if (iA == -1) {
                i13 = aVarValueAt.f44967c;
            } else {
                i13 = aVarValueAt.f44966b.get(iA).f44972e;
            }
        } else {
            aVarValueAt = this.f44964d.get(i10);
            if (aVarValueAt == null) {
                return -1;
            }
            iA = aVarValueAt.a(f10, f11);
            if (iA == -1) {
                i13 = aVarValueAt.f44967c;
            } else {
                i13 = aVarValueAt.f44966b.get(iA).f44972e;
            }
        }
        return i13;
    }
}
