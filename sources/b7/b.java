package b7;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.inscode.autoclicker.R;
import java.util.List;
import jc.w;
import uc.l;
import vc.g;
import y6.a1;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f3347a = new a(null);

    public static final class a {
        public a() {
        }

        public a(g gVar) {
        }

        public final PopupWindow a(Context context, List<b7.a> list, l<? super b7.a, w> lVar) {
            PopupWindow popupWindow = new PopupWindow(context);
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
            popupWindow.setOutsideTouchable(true);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setBackgroundResource(R.drawable.floating_background);
            for (b7.a aVar : list) {
                View viewInflate = View.inflate(context, R.layout.item_action, null);
                ((TextView) viewInflate.findViewById(R.id.itemActionText)).setText(aVar.f3346c);
                ((ImageView) viewInflate.findViewById(R.id.itemActionImage)).setImageResource(aVar.f3345b);
                viewInflate.setOnClickListener(new a1(lVar, aVar, popupWindow));
                linearLayout.addView(viewInflate);
            }
            popupWindow.setContentView(linearLayout);
            popupWindow.setAnimationStyle(R.style.PopupAnimation);
            return popupWindow;
        }
    }
}
