/**
 * 
 */
package com.newsagency.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.newsagency.dao.ArticleDAO;
import com.newsagency.model.Article;
import com.newsagency.service.url.ArticleCRUDRestURIConstants;

/**
 * @author bikash
 *
 */
@Controller
public class ArticleCRUDController extends DefaultController {

	private static final Logger logger = LoggerFactory
			.getLogger(ArticleCRUDController.class);

	@RequestMapping(value = ArticleCRUDRestURIConstants.GET_ARTICLE_BY_ID, method = RequestMethod.GET)
	public @ResponseBody Article getArticleById(
			@PathVariable("id") String articleId) {
		logger.info("get article by id : " + articleId);
		return null;

	}

	// TODO implement pagination
	@Transactional
	@RequestMapping(value = ArticleCRUDRestURIConstants.GET_ALL_ARTICLES, method = RequestMethod.GET)
	public @ResponseBody List<Article> getArticles() {
		logger.info("get all articles");
		return null;
	}

	@RequestMapping(value = ArticleCRUDRestURIConstants.CREATE_ARTICLE, method = RequestMethod.POST)
	public @ResponseBody Article createArticle(@RequestBody Article article) {
		logger.info("create article");
		return null;
	}

	@RequestMapping(value = ArticleCRUDRestURIConstants.UPDATE_ARTICLE, method = RequestMethod.POST)
	public @ResponseBody Article updateArticle(@RequestBody Article article,
			@PathVariable("id") long id) {
		logger.info("update article : " + id);
		return article;
	}

	@RequestMapping(value = ArticleCRUDRestURIConstants.DELETLE_ARTICLE, method = RequestMethod.DELETE)
	public @ResponseBody void deleteArticleById(@PathVariable("id") long id) {
	}

	private ArticleDAO getArticleDAO() {
		ArticleDAO dao = context.getBean(ArticleDAO.class);
		return dao;
	}

}
