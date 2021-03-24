package com.unclezs.novel.app.jfx.app.ui.pages.home.views;

import com.unclezs.novel.app.jfx.framework.annotation.FxView;
import com.unclezs.novel.app.jfx.framework.ui.components.sidebar.NavigateBundle;
import com.unclezs.novel.app.jfx.framework.ui.components.sidebar.SidebarNavigationView;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

/**
 * @author blog.unclezs.com
 * @since 2021/02/27 17:16
 */
@FxView(fxml = "/layout/home/views/search_network.fxml")
public class SearchNetworkView extends SidebarNavigationView {

  public Button button;
  public Text text;

  @Override
  public void onShow(NavigateBundle bundle) {
    if (bundle.getData() != null) {
      text.setText("来自：" + bundle.getFrom() + "   携带数据：" + bundle.get("data"));
    }
  }

  @Override
  public void onCreated() {
    button.setOnMouseClicked(event -> {
      NavigateBundle bundle = new NavigateBundle().put("data", "我是SearchNetworkView");
      navigate(SearchNetworkView.class, bundle);
    });
  }
}
