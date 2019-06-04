package com.project7.soap.webservices.bibliomanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;

import com.project7.soap.webservices.bibliomanagement.dao.AuthorRepository;
import com.project7.soap.webservices.bibliomanagement.dao.BookRepository;
import com.project7.soap.webservices.bibliomanagement.dao.CopyRepository;
import com.project7.soap.webservices.bibliomanagement.dao.EditorRepository;
import com.project7.soap.webservices.bibliomanagement.dao.GenreRepository;
import com.project7.soap.webservices.bibliomanagement.dao.LanguageRepository;
import com.project7.soap.webservices.bibliomanagement.dao.MemberRepository;
import com.project7.soap.webservices.bibliomanagement.dao.StatusRepository;
import com.project7.soap.webservices.bibliomanagement.entities.Author;
import com.project7.soap.webservices.bibliomanagement.entities.Book;
import com.project7.soap.webservices.bibliomanagement.entities.Copy;
import com.project7.soap.webservices.bibliomanagement.entities.Editor;
import com.project7.soap.webservices.bibliomanagement.entities.Genre;
import com.project7.soap.webservices.bibliomanagement.entities.Language;
import com.project7.soap.webservices.bibliomanagement.entities.Member;
import com.project7.soap.webservices.bibliomanagement.entities.Status;

@SpringBootApplication
public class BiblioManagementApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(BiblioManagementApplication.class);
	}

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(BiblioManagementApplication.class, args);

		AuthorRepository authorRepository = applicationContext.getBean(AuthorRepository.class);
		authorRepository.save(new Author("EDGAR", "MORIN"));
		authorRepository.save(new Author("TARIQ", "RAMADAN"));
		authorRepository.save(new Author("ALIX", "NICHOLS"));
		authorRepository.save(new Author("AKIRA", "HIMEKAWA"));
		authorRepository.save(new Author("ROBERT", "T.KIYOSAKI"));
		authorRepository.save(new Author("REGINE", "ABEL"));
		authorRepository.save(new Author("JUNO", "WELLS"));

		GenreRepository genreRepository = applicationContext.getBean(GenreRepository.class);
		genreRepository.save(new Genre("Romans policiers"));
		genreRepository.save(new Genre("Littérature sentimentale"));
		genreRepository.save(new Genre("Spiritualité"));
		genreRepository.save(new Genre("Politique"));
		genreRepository.save(new Genre("Histoire"));
		genreRepository.save(new Genre("Manga"));
		genreRepository.save(new Genre("Science Fiction"));
		genreRepository.save(new Genre("Romance"));

		LanguageRepository languageRepository = applicationContext.getBean(LanguageRepository.class);
		Language french = new Language("Français", "fr");
		Language english = new Language("Anglais", "en");
		languageRepository.save(french);
		languageRepository.save(english);

		EditorRepository editorRepository = applicationContext.getBean(EditorRepository.class);
		Editor e1 = new Editor("Presses du Châtelet");
		Editor e2 = new Editor("Plata Publishing");
		Editor e3 = new Editor("Independently published");
		Editor e4 = new Editor("Soleil");
		editorRepository.save(e1);
		editorRepository.save(e2);
		editorRepository.save(e3);
		editorRepository.save(e4);

		StatusRepository statusRepository = applicationContext.getBean(StatusRepository.class);
		statusRepository.save(new Status("En cours"));
		statusRepository.save(new Status("Prolongé"));
		statusRepository.save(new Status("Rendu à temps"));
		statusRepository.save(new Status("Non rendu à temps"));

		BookRepository bookRepository = applicationContext.getBean(BookRepository.class);
		Book b1 = new Book("Au péril des idées", "au_peril_des_idees.jpg",
				"Rencontre inattendue : le penseur de la complexité face au philosophe théologien réformateur. L’agnostique face au croyant. Le descendant de marranes face au fils d’exilés égyptiens. Le « fréquentable » Edgar Morin face à l’« infréquentable » Tariq Ramadan…\n"
						+ "Loin des clichés attachés à leurs noms, ce sont surtout deux intellectuels ancrés dans leur époque et dans leur culture, deux Européens déclarés qui cherchent ici une « Voie » commune, évoquent leurs années de formation et débattent, avec la complicité de Claude-Henry du Bord, sur l’éducation, les sciences, l’art, la laïcité, les droits des femmes et des minorités, le nouveau Moyen-Orient, le conflit israélo-palestinien, l’antisémitisme et l’islamophobie, la démocratie et le fondamentalisme, la mondialisation et le pardon…\n"
						+ "Deux conceptions du monde et de la foi, deux philosophies de vie qui ne demandent qu’à s’écouter.",
				9782845925519L, french, e1);
		Book b2 = new Book("RICH DAD POOR DAD", "rich_dad_poor_dad.jpg",
				"April 2017 marks 20 years since Robert Kiyosakis Rich Dad Poor Dad first made waves in the Personal Finance arena It has since become the 1 Personal Finance book of all time translated into dozens of languages and sold around the world Rich Dad Poor Dad is Roberts story of growing up with two dads his real father and the father of his best friend his rich dad and the ways in which both men shaped his thoughts about money and investing The book explodes the myth that you need to earn a high income to be rich and explains the difference between working for money and having your money work for you 20 Years 2020 Hindsight In the 20th Anniversary Edition of this classic Robert offers an update on what weve seen over the past 20 years related to money investing and the global economy Sidebars throughout the book will take readers fast forward from 1997 to today as Robert assesses how the principles taught by his rich dad have stood the test of time In many ways the messages of Rich Dad Poor Dad messages that were criticized and challenged two decades ago are more meaningful relevant and important today than they were 20 years ago As always readers can expect that Robert will be candid insightful and continue to rock more than a few boats in his retrospective Will there be a few surprises Count on it Rich Dad Poor Dad Explodes the myth that you need to earn a high income to become rich Challenges the belief that your house is an asset Shows parents why they cant rely on the school system to teach their kids about money Defines once and for all an asset and a liability Teaches you what to teach your kids about money for their future financial success.",
				9781612680194L, english, e2);
		Book b3 = new Book("Les Frères Darcy", "les_freres_darcy.jpg",
				"Un faux mariage, une amourette au bureau et un email perdu…\n"
						+ "renversent les vies de 3 frères aristocrates\n"
						+ "dans cette série romantique, sexy, drôle et totalement addictive.\n" + "\n"
						+ "Plus de 700 pages de secrets de famille, de rebondissements et de romance à vous couper le souffle.\n"
						+ "",
				9781093119886L, french, e3);
		Book b4 = new Book("Legend of Zelda - Twilight Princess", "legend_of_zelda.jpg",
				"Après un an et demi passé dans le paisible village de Toal, le jeune Link peut être fier de lui : sa gentillesse, son courage et sa dévotion lui ont permis d'être totalement intégré dans cette communauté. Mais Link a peur que les villageois finissent par découvrir le terrible secret de son passé, au point qu'il n'en dort plus la nuit ! Et si ses cauchemars annonçaient le retour imminent des êtres maléfiques du monde de la pénombre ? Comment faire pour les empêcher de semer à nouveau le chaos ?",
				9782302072787L, french, e4);
		Book b5 = new Book("Légion", "legion.jpg",
				"Ayana a passé sa vie à s’entraîner pour rejoindre l’Avant-Garde, l’élite militaire intergalactique vouée à combattre les Kryptides, les envahisseurs qui avaient presque détruit la Terre. Seules les femmes possédant de puissants pouvoirs psychiques sont choisies. Pourtant, même si ses pouvoirs sont inégalés, Ayana est incapable d’effectuer la tâche cruciale d’attraper les âmes, même quand le Guerrier dont elle rêve depuis des années lui offre volontairement la sienne.\n"
						+ "\n"
						+ "Légion est envoûté par la beauté de l’aura d’Ayana. Dès l’instant où son âme touche la sienne, il reconnaît son âme sœur. Même si elle est incapable de tenir l’âme d’un Guerrier, une étrange étincelle en elle pourrait lui donner un incroyable avantage dans cette guerre sanglante. Quand un traître infiltre leurs rangs, déterminé à les détruire de l’intérieur, Légion est déchiré entre ses devoirs de leader de l’Avant-Garde et le besoin de protéger sa conjointe. \n"
						+ "\n"
						+ "Perdra-t-il la femme à laquelle il a donné son âme sitôt après l’avoir enfin trouvée ?",
				9781093697766L, french, e3);
		bookRepository.save(b1);
		bookRepository.save(b2);
		bookRepository.save(b3);
		bookRepository.save(b4);
		bookRepository.save(b5);

		MemberRepository memberRepository = applicationContext.getBean(MemberRepository.class);
		Member m1 = new Member("Driss", "Rais", "drissrais@gmail.com", "ROMMOR89");
		memberRepository.save(m1);
		
		CopyRepository copyRepository = applicationContext.getBean(CopyRepository.class);
		copyRepository.save(new Copy(b1));
		copyRepository.save(new Copy(b1));
		copyRepository.save(new Copy(b1));
		copyRepository.save(new Copy(b1));
		copyRepository.save(new Copy(b1));
		copyRepository.save(new Copy(b1));
		copyRepository.save(new Copy(b1));
		copyRepository.save(new Copy(b1));
		copyRepository.save(new Copy(b1));
		copyRepository.save(new Copy(b1));
		
		copyRepository.save(new Copy(b2));
		copyRepository.save(new Copy(b2));
		copyRepository.save(new Copy(b2));
		copyRepository.save(new Copy(b2));
		copyRepository.save(new Copy(b2));
		copyRepository.save(new Copy(b2));
		
		copyRepository.save(new Copy(b3));
		copyRepository.save(new Copy(b3));
		copyRepository.save(new Copy(b3));
		copyRepository.save(new Copy(b3));
		copyRepository.save(new Copy(b3));
		copyRepository.save(new Copy(b3));
		copyRepository.save(new Copy(b3));
		copyRepository.save(new Copy(b3));
		
		copyRepository.save(new Copy(b4));
		copyRepository.save(new Copy(b4));
		copyRepository.save(new Copy(b4));
		copyRepository.save(new Copy(b4));
		copyRepository.save(new Copy(b4));
		
		copyRepository.save(new Copy(b5));
		copyRepository.save(new Copy(b5));
		copyRepository.save(new Copy(b5));
		copyRepository.save(new Copy(b5));
		copyRepository.save(new Copy(b5));
		copyRepository.save(new Copy(b5));
		copyRepository.save(new Copy(b5));
		copyRepository.save(new Copy(b5));
		copyRepository.save(new Copy(b5));
		copyRepository.save(new Copy(b5));

	}

}
