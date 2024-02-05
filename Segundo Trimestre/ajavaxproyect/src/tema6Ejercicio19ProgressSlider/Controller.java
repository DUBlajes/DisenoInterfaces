package tema6Ejercicio19ProgressSlider;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;

public class Controller {
    @FXML
    private ProgressBar progressBar;

    @FXML
    private Label slidervalorLabel;

    @FXML
    private Slider slider;

    @FXML
    private void initialize() {
        // Configurar el evento de cambio en el slider
        slider.setOnMouseReleased(event -> moverRaton());

        // Configurar el evento de cambio en el progreso
        progressBar.progressProperty().bind(slider.valueProperty().divide(10));
        //valueproperty obtiene el valor y lo divide entre 10, con bind establecemos una relacion
        //entre el valor de progreso y la propiedad de valor actual
    }

    private void moverRaton() {
        Platform.runLater(() -> {
            double sliderValor = slider.getValue();
            System.out.println("Slider Valor: " + (int) sliderValor); //hacemos un casting

            if (slidervalorLabel != null) {
                slidervalorLabel.setText("SLIDER: " + (int) sliderValor); //casteamos de nuevo
            } else {
                System.out.println("sliderValorLabel is null");
            }
        });
    }
}
