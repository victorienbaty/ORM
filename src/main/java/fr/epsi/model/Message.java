package fr.epsi.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

public class Message implements Serializable {
        @Id
        @GeneratedValue
        private long id;
        private String text;
        private long points;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public long getPoints() {
            return points;
        }

        public void setPoints(long points) {
        this.points = points;
        }
}