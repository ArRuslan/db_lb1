package me.ruslan.dblb1;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;
import org.kordamp.bootstrapfx.BootstrapFX;

import java.io.IOException;

public class AllTablesForm {
    public void show(Window owner) {
        try {
            Stage stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(MainForm.class.getResource("all_tables.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 720, 600);
            scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());

            stage.setTitle("All tables");
            stage.setScene(scene);
            stage.setResizable(false);
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(owner);
            stage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
