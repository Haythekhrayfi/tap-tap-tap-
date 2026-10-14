package y;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static HashMap<String, Constructor<? extends d>> f37653b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap<Integer, ArrayList<d>> f37654a = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends d>> map = new HashMap<>();
        f37653b = map;
        try {
            map.put("KeyAttribute", e.class.getConstructor(new Class[0]));
            f37653b.put("KeyPosition", h.class.getConstructor(new Class[0]));
            f37653b.put("KeyCycle", f.class.getConstructor(new Class[0]));
            f37653b.put("KeyTimeCycle", j.class.getConstructor(new Class[0]));
            f37653b.put("KeyTrigger", k.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException e10) {
            Log.e("KeyFrames", "unable to load", e10);
        }
    }

    public g() {
    }

    public g(Context context, XmlPullParser xmlPullParser) {
        d dVarNewInstance;
        Exception e10;
        HashMap<String, androidx.constraintlayout.widget.a> map;
        d dVar = null;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (f37653b.containsKey(name)) {
                        try {
                            Constructor<? extends d> constructor = f37653b.get(name);
                            if (constructor == null) {
                                throw new NullPointerException("Keymaker for " + name + " not found");
                            }
                            dVarNewInstance = constructor.newInstance(new Object[0]);
                            try {
                                dVarNewInstance.e(context, Xml.asAttributeSet(xmlPullParser));
                                b(dVarNewInstance);
                            } catch (Exception e11) {
                                e10 = e11;
                                Log.e("KeyFrames", "unable to create ", e10);
                            }
                            dVar = dVarNewInstance;
                        } catch (Exception e12) {
                            dVarNewInstance = dVar;
                            e10 = e12;
                        }
                        Log.e("KeyFrames", "unable to create ", e10);
                        dVar = dVarNewInstance;
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (dVar != null && (map = dVar.f37614e) != null) {
                            androidx.constraintlayout.widget.a.e(context, xmlPullParser, map);
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && dVar != null && (map = dVar.f37614e) != null) {
                        androidx.constraintlayout.widget.a.e(context, xmlPullParser, map);
                    }
                } else if (eventType == 3 && "KeyFrameSet".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e13) {
            e13.printStackTrace();
        } catch (XmlPullParserException e14) {
            e14.printStackTrace();
        }
    }

    public void a(n nVar) {
        ArrayList<d> arrayList = this.f37654a.get(Integer.valueOf(nVar.f37729c));
        if (arrayList != null) {
            nVar.f37749w.addAll(arrayList);
        }
        ArrayList<d> arrayList2 = this.f37654a.get(-1);
        if (arrayList2 != null) {
            for (d dVar : arrayList2) {
                String str = ((ConstraintLayout.b) nVar.f37728b.getLayoutParams()).f1432c0;
                String str2 = dVar.f37612c;
                if ((str2 == null || str == null) ? false : str.matches(str2)) {
                    nVar.f37749w.add(dVar);
                }
            }
        }
    }

    public void b(d dVar) {
        if (!this.f37654a.containsKey(Integer.valueOf(dVar.f37611b))) {
            this.f37654a.put(Integer.valueOf(dVar.f37611b), new ArrayList<>());
        }
        ArrayList<d> arrayList = this.f37654a.get(Integer.valueOf(dVar.f37611b));
        if (arrayList != null) {
            arrayList.add(dVar);
        }
    }
}
