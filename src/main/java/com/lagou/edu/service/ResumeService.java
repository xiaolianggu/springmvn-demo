package com.lagou.edu.service;

import com.lagou.edu.pojo.Resume;

import java.util.List;

public interface ResumeService {
    public List<Resume> findAll();

    public Resume findById(Long id);

    public boolean insert(Resume resume);

    public boolean edit(Resume resume);

    public boolean deleteById(Long id);
}
