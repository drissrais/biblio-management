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
		GenreRepository genreRepository = applicationContext.getBean(GenreRepository.class);
		LanguageRepository languageRepository = applicationContext.getBean(LanguageRepository.class);
		EditorRepository editorRepository = applicationContext.getBean(EditorRepository.class);
		StatusRepository statusRepository = applicationContext.getBean(StatusRepository.class);
		BookRepository bookRepository = applicationContext.getBean(BookRepository.class);
		MemberRepository memberRepository = applicationContext.getBean(MemberRepository.class);
		CopyRepository copyRepository = applicationContext.getBean(CopyRepository.class);
		
		Member m1 = new Member("Driss", "Rais", "drissrais@gmail.com", "ROMMOR89");
		memberRepository.save(m1);
		
		Language french = new Language("Français", "fr");
		Language english = new Language("Anglais", "en");
		languageRepository.save(french);
		languageRepository.save(english);
		
		Editor e1 = new Editor("Presses du Châtelet");
		Editor e2 = new Editor("Plata Publishing");
		Editor e3 = new Editor("Independently published");
		Editor e4 = new Editor("Soleil");
		Editor e5 = new Editor("Sagesse d'Orient");
		editorRepository.save(e1);
		editorRepository.save(e2);
		editorRepository.save(e3);
		editorRepository.save(e4);
		editorRepository.save(e5);
		
		statusRepository.save(new Status("En cours"));
		statusRepository.save(new Status("Prolongé"));
		statusRepository.save(new Status("Rendu à temps"));
		statusRepository.save(new Status("Non rendu à temps"));
		
		Genre g1 = new Genre("Romans policiers");
		Genre g2 = new Genre("Littérature sentimentale");
		Genre g3 = new Genre("Spiritualité");
		Genre g4 = new Genre("Politique");
		Genre g5 = new Genre("Histoire");
		Genre g6 = new Genre("Manga");
		Genre g7 = new Genre("Science Fiction");
		Genre g8 = new Genre("Romance");
		Genre g9 = new Genre("Développement personnel");
		Genre g10 = new Genre("Management");
		Genre g11 = new Genre("Business");
		
		Author auth1 = new Author("EDGAR", "MORIN");
		Author auth2 = new Author("TARIQ", "RAMADAN");
		Author auth3 = new Author("ALIX", "NICHOLS");
		Author auth4 = new Author("AKIRA", "HIMEKAWA");
		Author auth5 = new Author("ROBERT", "T.KIYOSAKI");
		Author auth6 = new Author("REGINE", "ABEL");
		Author auth7 = new Author("JUNO", "WELLS");
		
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
		Book b6 = new Book("Muhammad vie du prophète", "muhammad_vie_du_prophete.jpg", "Le Prophète occupe une place unique dans la conscience et la vie des musulmans. Il est l'Envoyé de Dieu, celui qui a reçu et transmis le Coran. Il n'est pourtant pas un médiateur : Muhammad ne fut qu'un homme, qui a transformé le monde à la lumière des révélations et des inspirations qui lui sont parvenues de l'Unique.\n" + 
				"\n" + 
				"Cette humanité assumée, élue et inspirée fait de lui un modèle pour les fidèles d'aujourd'hui. Son parcours renvoie aux questions premières et éternelles : sa vie est une invite à l'humilité, à la fraternité, au respect, à la justice et à la paix. Mais aussi, et surtout, à l'amour. C'est pourquoi le souffle de la Révélation porte un enseignement utile à tous les hommes, qu'ils soient ou non musulmans.\n" + 
				"\n" + 
				"Humanité, exemplarité : telles sont les deux dimensions à travers lesquelles Tariq Ramadan restitue la figure fondatrice de l'islam. S'appuyant sur les sources les plus fiables, il restitue le parcours et les actions de Muhammad, accompa­gnant son récit de réflexions sur le sens profond de cette vie. Parce qu'il souligne l'actualité de la parole du Prophète, ce livre est également une introduction privilégiée à l'islam.\n" + 
				"\n" + 
				"Tariq Ramadan, professeur d'islamologie, enseigne aux universités d'Oxford et de Rotterdam. Attaché à l'université de Doshisha (Kyoto), il est également président du groupe de réflexion et d'action European Muslim Network à Bruxelles. Engagé depuis vingt ans dans le renouveau de la pensée musulmane et dans la réflexion sur la place de l'islam en Occident et dans le monde, il est l'auteur de Islam, la réforme radicale (Presses du Châtelet, 2008).", 9782352870975L, french, e5);
		
		b1.getAuthors().add(auth1);
		b1.getAuthors().add(auth2);
		b2.getAuthors().add(auth5);
		b3.getAuthors().add(auth3);
		b4.getAuthors().add(auth4);
		b5.getAuthors().add(auth6);
		b5.getAuthors().add(auth7);
		b6.getAuthors().add(auth2);
		
		b1.getGenres().add(g3);
		b1.getGenres().add(g4);
		b2.getGenres().add(g9);
		b2.getGenres().add(g10);
		b2.getGenres().add(g11);
		b3.getGenres().add(g1);
		b3.getGenres().add(g5);
		b4.getGenres().add(g6);
		b4.getGenres().add(g7);
		b5.getGenres().add(g2);
		b5.getGenres().add(g5);
		b5.getGenres().add(g8);
		b6.getGenres().add(g3);
		b6.getGenres().add(g5);
		
		g1.getBooks().add(b3);
		g2.getBooks().add(b5);
		g3.getBooks().add(b1);
		g3.getBooks().add(b6);
		g4.getBooks().add(b1);
		g5.getBooks().add(b3);
		g5.getBooks().add(b5);
		g5.getBooks().add(b6);
		g6.getBooks().add(b4);
		g7.getBooks().add(b4);
		g8.getBooks().add(b5);
		g9.getBooks().add(b2);
		g10.getBooks().add(b2);
		g11.getBooks().add(b2);
		
		auth1.getBooks().add(b1);
		auth2.getBooks().add(b1);
		auth2.getBooks().add(b6);
		auth3.getBooks().add(b3);
		auth4.getBooks().add(b4);
		auth5.getBooks().add(b2);
		auth6.getBooks().add(b5);
		auth7.getBooks().add(b5);
		
		bookRepository.save(b1);
		bookRepository.save(b2);
		bookRepository.save(b3);
		bookRepository.save(b4);
		bookRepository.save(b5);
		bookRepository.save(b6);
		
		authorRepository.save(auth1);
		authorRepository.save(auth2);
		authorRepository.save(auth3);
		authorRepository.save(auth4);
		authorRepository.save(auth5);
		authorRepository.save(auth6);
		authorRepository.save(auth7);

		genreRepository.save(g1);
		genreRepository.save(g2);
		genreRepository.save(g3);
		genreRepository.save(g4);
		genreRepository.save(g5);
		genreRepository.save(g6);
		genreRepository.save(g7);
		genreRepository.save(g8);
		genreRepository.save(g9);
		genreRepository.save(g10);
		genreRepository.save(g11);

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
		
		copyRepository.save(new Copy(b6));
		copyRepository.save(new Copy(b6));
		copyRepository.save(new Copy(b6));
		copyRepository.save(new Copy(b6));
		copyRepository.save(new Copy(b6));
		copyRepository.save(new Copy(b6));
		copyRepository.save(new Copy(b6));
		copyRepository.save(new Copy(b6));
		copyRepository.save(new Copy(b6));
		copyRepository.save(new Copy(b6));
		copyRepository.save(new Copy(b6));
		copyRepository.save(new Copy(b6));

	}

}
