#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Jun  8 00:25:17 2021

@author: kakatuahitam
"""

from setuptools import setup

setup(
    name='studyclub',
    packages=['studyclub'],
    include_package_data=True,
    install_requires=[
        'flask==2.0.1',
    ],
)
