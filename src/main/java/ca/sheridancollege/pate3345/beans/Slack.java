package ca.sheridancollege.pate3345.beans;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
//@RequiredArgsConstructor
public class Slack {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NonNull
	private String author;
	@NonNull
	private String title;
	@NonNull
	private String desc;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate appdate = LocalDate.now();

	public Slack(@NonNull String author, @NonNull String title, @NonNull String desc, LocalDate appdate) {
		super();
		this.author = author;
		this.title = title;
		this.desc = desc;
		this.appdate = appdate;
	}
}
