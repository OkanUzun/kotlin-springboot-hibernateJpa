package com.okan.KotlinSpringBootHibernateJPA.repository

import com.okan.KotlinSpringBootHibernateJPA.model.Article
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ArticleRepository : JpaRepository<Article, Long>